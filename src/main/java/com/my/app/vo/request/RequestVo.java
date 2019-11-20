package com.my.app.vo.request;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestVo implements Serializable {

	@NotEmpty(message = "设备不能为空")
	private String device;
	
	private String uniqueIdentity;
}
