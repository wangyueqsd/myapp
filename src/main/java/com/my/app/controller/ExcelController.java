package com.my.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.my.app.vo.request.RequestVo;
import com.my.app.vo.response.ExcelVo;

@RestController
@RequestMapping("excel")
public class ExcelController extends BaseController {

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
	    for (int i = 0; i < 10; i++) {
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
}
