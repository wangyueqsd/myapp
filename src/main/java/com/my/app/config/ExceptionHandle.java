package com.my.app.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.my.app.common.CommonUtil;
import com.my.app.common.ServiceCode;

/**
 * controller统一异常捕获
 * @author Administrator
 *
 */
@ControllerAdvice(annotations = RestController.class)
public class ExceptionHandle {

	public static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Exception ex) {

		logger.error("系统异常：", ex);

		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		String uri = "";
		if(null != attributes) {
			HttpServletRequest request = attributes.getRequest();
			// 获取请求url
			uri = request.getServletPath();
		}
		
		JSONObject json = (JSONObject) JSONObject.parse(JSON.toJSONString(CommonUtil.setResultMessage(null, ServiceCode.SYSTEM_ERROR)));
		
		if (ex instanceof RpcException) {

			logger.info(">>>>>> 请求地址：{}, 返回参数为：{}", uri, json.toJSONString());

			return JSON.toJSONString(CommonUtil.setResultMessage(null, ServiceCode.SYSTEM_ERROR));

		} else {

			logger.info(">>>>>> 请求地址：{}, 返回参数为：{}", uri, json.toJSONString());

			return JSON.toJSONString(CommonUtil.setResultMessage(null, ServiceCode.SYSTEM_ERROR));
		}
	}
}
