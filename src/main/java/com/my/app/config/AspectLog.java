package com.my.app.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.my.app.vo.request.RequestVo;

/**
 * 日志切面类
 *
 */
@Aspect
@Component
@Order(-5)
public class AspectLog {

	private static final Logger logger = LoggerFactory.getLogger(AspectLog.class);

	/**
	 * 切面
	 */
	@Pointcut("execution(public * com.my.app.controller..*(..))")
	public void webLog() {
		//
	}

	@Around("webLog()")
	@SuppressWarnings("unchecked")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

		// 获取请求
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 获取所有请求参数
		Object[] args = pjp.getArgs();
		// 解析请求参数
		Map<String, Object> requestMap = new HashMap<String, Object>(16);
		if ("POST".equals(request.getMethod())) {
			for (Object obj : args) {
				// 为字符串
				if (obj instanceof String) {
					requestMap.put("request message", obj);
					break;
				}else if(obj instanceof Map){
					requestMap = (Map<String, Object>)obj;
					break;
				}else if(obj instanceof RequestVo) {
					JSONObject json = JSONObject.parseObject(JSONObject.toJSONString(obj));
					
					requestMap = JSONObject.toJavaObject(json, Map.class);
				}
			}
		}

		// 获取请求url
		String uri = request.getServletPath();
		logger.info(">>>>>>>>>>> 请求地址：{}, 请求参数为：{}" , uri , JSONObject.toJSONString(requestMap));
		// 执行方法
		Object result = pjp.proceed();
		return result;
	}
	
	
	@AfterReturning(pointcut="webLog()", returning="respStr")
	public void doAfterReturning(Object respStr) throws Exception {

		// 获取请求
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 获取请求url
		String uri = request.getServletPath();
		if (respStr != null) {

			logger.info(">>>>>>>>>>> 请求地址：{}, 返回参数为：{},耗时：{}ms", uri, JSON.toJSONString(respStr));
		}else {
			logger.info(">>>>>>>>>>> 请求地址：{}, 返回参数为：{},耗时：{}ms", uri, respStr);
		}
	}

}
