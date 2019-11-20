package com.my.app.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.common.CommonUtil;
import com.my.app.common.ResultMessageObject;
import com.my.app.service.UserService;
import com.my.app.vo.request.UserRequestVo;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {

	@Resource
	UserService userService;
	
	@RequestMapping("getList")
	public Object getList(@RequestBody @Valid UserRequestVo vo, BindingResult results) {
		ResultMessageObject result = ResultMessageObject.buildSuccessMessageObject();
		// 字段校验
		if (results.hasErrors()) {
			CommonUtil.setResultMessage(result, results.getFieldError().getDefaultMessage());
			return result;
		}
		result = userService.getList(vo);
		return result;
	}
}
