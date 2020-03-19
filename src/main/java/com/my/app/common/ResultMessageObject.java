package com.my.app.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResultMessageObject implements Serializable {

	private static final long serialVersionUID = -2340586457726840127L;

	// 响应代码
	private String code;

	// 响应信息
	private String message;

	// 是否成功
	private String success;

	// 报文体
	private Map<String, Object> data;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public ResultMessageObject() {

	}

	// 设置生成默认成功的消息体
	public static ResultMessageObject buildSuccessMessageObject() {
		ResultMessageObject successMessageObject = new ResultMessageObject();
		successMessageObject.setSuccess("1");
		successMessageObject.setCode(ServiceCode.SUCCESS.getCode());
		successMessageObject.setMessage(ServiceCode.SUCCESS.getText());
		return successMessageObject;
	}

	public ResultMessageObject(String code, String message, String success, Map<String, Object> data) {
		this.code = code;
		this.message = message;
		this.success = success;
		this.data = data;
	}

	/**
	 * 设置返回信息
	 *
	 * @param serviceCode
	 * @return
	 */
	public  ResultMessageObject setResultMessage(ServiceCode serviceCode) {
		if ("0000".equals(serviceCode.getCode())) {
			this.setSuccess("1");
		} else {
			this.setSuccess("0");
		}
		this.setCode(serviceCode.getCode());
		this.setMessage(serviceCode.getText());
		return this;
	}


	/**
	 * 设置异常返回信息
	 *
	 * @param serviceCode
	 * @return
	 */
	public ResultMessageObject setExceptionResultMessage(ServiceCode serviceCode,
																String exceptionMsg) {
		this.setSuccess("0");
	    this.setCode(serviceCode.getCode());
		this.setMessage(exceptionMsg);

		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getData() {
		if (data == null) {
			data = new HashMap<String, Object>(16);
		}

		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

}
