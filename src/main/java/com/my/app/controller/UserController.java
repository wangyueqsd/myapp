package com.my.app.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.common.CommonUtil;
import com.my.app.common.ResultMessageObject;
import com.my.app.service.FrontBankInfoService;
import com.my.app.service.UserService;
import com.my.app.vo.request.UserRequestVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("用户控制器")
@RestController
@RequestMapping("user")
public class UserController extends BaseController {

	@Resource(name = "userServiceImpl")
	UserService userService;
	
	@Resource
	FrontBankInfoService frontBankInfoService;
	
	@ApiOperation(value="getList", notes="根据url的name来say hello!")
	@PostMapping("getList")
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
	
	@PostMapping("getBankList")
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
