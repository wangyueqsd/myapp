package com.my.app.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSON;
import com.my.app.dao.FrontAccountInfoMapper;
import com.my.app.vo.ExcelReadDataListener;
import com.my.app.vo.request.RequestVo;
import com.my.app.vo.response.ExcelVo;

@RestController
@RequestMapping("excel")
public class ExcelController extends BaseController {
	
	@Resource
	private FrontAccountInfoMapper frontAccountInfoMapper;

	@PostMapping("write")
	public Object writeExcel(RequestVo request) {
		String fileName = "F:\\Download/" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
		logger.info(fileName);
	    // 这里 需要指定写用哪个class去写
	    ExcelWriter excelWriter = EasyExcel.write(fileName, ExcelVo.class).build();
	    WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
	    excelWriter.write(data(), writeSheet);
	    // 千万别忘记finish 会帮忙关闭流
	    excelWriter.finish();
		return "Success";
	}
	
	private List<ExcelVo> data() {
	    List<ExcelVo> list = new ArrayList<ExcelVo>();
	    int count = 10;
	    for (int i = 0; i < count; i++) {
	    	ExcelVo data = new ExcelVo();
	    	data.setId(Long.valueOf(i));
	        data.setBankCode("A00"+i);
	        data.setBankName("建行"+i);
	        data.setMaxLimitMoney(100.25);
	        data.setMinLimitMoney(0.56);
	        list.add(data);
	    }
	    return list;
	}
	
	@PostMapping("read")
	public Object read(RequestVo request) {
		String fileName = "F:\\Download/" + "demo" + File.separator + "demo.xlsx";
        ExcelReader excelReader = EasyExcel.read(fileName, ExcelVo.class, new ExcelReadDataListener(frontAccountInfoMapper)).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
		return "Success";
	}
	
	@GetMapping("downloadFailedUsingJson")
    public void downloadFailedUsingJson(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("测试", "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), ExcelVo.class).autoCloseStream(Boolean.FALSE).sheet("模板")
                .doWrite(data());
        } catch (Exception e) {
            // 重置response
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = new HashMap<String, String>(16);
            map.put("status", "failure");
            map.put("message", "下载文件失败" + e.getMessage());
            response.getWriter().println(JSON.toJSONString(map));
        }
    }
	
    /**
     * 文件上传
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link UploadData}
     * <p>
     * 2. 由于默认异步读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UploadDataListener}
     * <p>
     * 3. 直接读即可
     */
    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), ExcelVo.class, new ExcelReadDataListener(frontAccountInfoMapper)).sheet().doRead();
        return "success";
    }
}
