package com.my.app.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.hibernate.hql.internal.CollectionSubqueryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.my.app.dao.FrontAccountInfoMapper;
import com.my.app.entity.FrontAccountInfo;
import com.my.app.vo.response.ExcelVo;

public class ExcelReadDataListener extends AnalysisEventListener<ExcelVo> {
	
	private static final Logger logger = LoggerFactory.getLogger(ExcelReadDataListener.class);
	
	/**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 1;
    List<ExcelVo> list = new ArrayList<ExcelVo>();
    
    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service。当然如果不用存储这个对象没用。
     */
    private FrontAccountInfoMapper frontAccountInfoMapper;

    public ExcelReadDataListener() {
        // 这里是demo，所以随便new一个。实际使用如果到了spring,请使用下面的有参构造函数
    	
    }

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param demoDAO
     */
    public ExcelReadDataListener(FrontAccountInfoMapper frontAccountInfoMapper) {
        this.frontAccountInfoMapper = frontAccountInfoMapper;
    }

	@Override
	public void invoke(ExcelVo data, AnalysisContext context) {
		// TODO Auto-generated method stub
		logger.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {
		// TODO Auto-generated method stub
		// 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        logger.info("所有数据解析完成！");
	}
	
	private void saveData() {
		logger.info("{}条数据，开始存储数据库！", list.size());
		if(CollectionUtils.isNotEmpty(list)) {
			
			ExcelVo vo = list.get(0);
			FrontAccountInfo frontAccountInfo = new FrontAccountInfo();
			frontAccountInfo.setId_card_no(vo.getBankCode());
			frontAccountInfo.setThird_cust_id(vo.getBankName());
			frontAccountInfoMapper.insertSelective(frontAccountInfo);
		}
		logger.info("存储数据库成功！");
	}

}
