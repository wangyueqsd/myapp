package com.my.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.app.common.ResultMessageObject;
import com.my.app.dao.FrontAccountInfoMapper;
import com.my.app.entity.FrontAccountInfo;
import com.my.app.entity.FrontAccountInfoExample;
import com.my.app.service.UserService;
import com.my.app.vo.request.RequestVo;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	FrontAccountInfoMapper frontAccountInfoMapper;
	
	@Override
	public ResultMessageObject getList(RequestVo request) {
		ResultMessageObject result = ResultMessageObject.buildSuccessMessageObject();
		FrontAccountInfoExample example = new FrontAccountInfoExample();
		example.createCriteria().andAuth_statusEqualTo(1);
		PageHelper.startPage(0, 1);
		List<FrontAccountInfo> list = frontAccountInfoMapper.selectByExample(example);
		PageInfo<FrontAccountInfo> appsPageInfo = new PageInfo<FrontAccountInfo>(list);
		if(CollectionUtils.isNotEmpty(list)) {
			result.getData().put("list", list);
			result.getData().put("page", appsPageInfo);
		}
//		int i = 1/0;
		return result;
	}

}
