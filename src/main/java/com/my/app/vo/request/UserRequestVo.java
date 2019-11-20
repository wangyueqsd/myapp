package com.my.app.vo.request;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequestVo extends RequestVo {

	@NotEmpty(message = "姓名不能为空")
	private String name;
}
