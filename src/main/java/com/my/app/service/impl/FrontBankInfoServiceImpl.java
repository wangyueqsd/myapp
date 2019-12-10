package com.my.app.service.impl;

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
		return resultMessageObject;
	}
}
