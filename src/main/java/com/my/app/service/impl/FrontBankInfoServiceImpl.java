package com.my.app.service.impl;

import java.math.BigInteger;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.my.app.common.ResultMessageObject;
import com.my.app.dao.FrontBankInfoRepository;
import com.my.app.entity.FrontBankInfo;
import com.my.app.service.FrontBankInfoService;
import com.my.app.vo.request.RequestVo;

@Service
public class FrontBankInfoServiceImpl implements FrontBankInfoService{

	@Resource
	private FrontBankInfoRepository frontBankInfoRepository;

	@Override
	public ResultMessageObject getList(RequestVo request) {
		ResultMessageObject resultMessageObject = ResultMessageObject.buildSuccessMessageObject();
		FrontBankInfo frontBankInfo = new FrontBankInfo();
		frontBankInfo.setRecordState(1);
		Example<FrontBankInfo> example = Example.of(frontBankInfo);
		List<FrontBankInfo> findAll = frontBankInfoRepository.findAll(example);
		resultMessageObject.getData().put("list", findAll);
		
		frontBankInfo = new FrontBankInfo();
		frontBankInfo.setBankCardNo("1");
		frontBankInfo.setBankCode("1");
		frontBankInfo.setBankName("1");
		frontBankInfo.setIdCardNo("1");
		frontBankInfo.setName("1");
		frontBankInfo.setPhoneNo(new BigInteger("123123123"));
		frontBankInfo.setRequestNo("11111");
		frontBankInfo.setCreator("1");
		frontBankInfo.setUpdator("1");
		frontBankInfo.setRemark("");
		frontBankInfoRepository.save(frontBankInfo);
		
		List<FrontBankInfo> list = frontBankInfoRepository.findByBankCardNo("1");
		resultMessageObject.getData().put("list2", list);
		
		list = frontBankInfoRepository.findByBankCardNoAndIdCardNo("1","2");
		resultMessageObject.getData().put("list3", list);
		return resultMessageObject;
	}
}
