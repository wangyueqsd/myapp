package com.my.app.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.common.CommonUtil;
import com.my.app.common.ResultMessageObject;
import com.my.app.service.FrontBankInfoService;
import com.my.app.service.UserService;
import com.my.app.vo.request.UserRequestVo;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {

	@Resource
	UserService userService;
	
	@Resource
	FrontBankInfoService frontBankInfoService;
	
	@RequestMapping("getList")
	public Object getList(@RequestBody @Valid UserRequestVo vo, BindingResult results) {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ResultMessageObject result = ResultMessageObject.buildSuccessMessageObject();
		// 字段校验
		if (results.hasErrors()) {
			CommonUtil.setResultMessage(result, results.getFieldError().getDefaultMessage());
			return result;
		}
		result = userService.getList(vo);
		return result;
	}
	
	@RequestMapping("getBankList")
	public Object getBankList(@RequestBody @Valid UserRequestVo vo, BindingResult results) {
		ResultMessageObject result = ResultMessageObject.buildSuccessMessageObject();
		// 字段校验
		if (results.hasErrors()) {
			CommonUtil.setResultMessage(result, results.getFieldError().getDefaultMessage());
			return result;
		}
		result = frontBankInfoService.getList(vo);
		return result;
	}
}
