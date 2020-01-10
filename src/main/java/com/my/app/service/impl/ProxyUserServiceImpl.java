package com.my.app.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.app.common.ResultMessageObject;
import com.my.app.service.UserService;
import com.my.app.vo.request.RequestVo;

@Service("proxyUserServiceImpl")
public class ProxyUserServiceImpl implements UserService {

	@Resource()
	private UserService userService;
	
	@Override
	public ResultMessageObject getList(RequestVo request) {
		// TODO Auto-generated method stub
		return userService.getList(request);
	}

}
