package com.my.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ViewController extends BaseController {
	
	@RequestMapping("getView")
	public String getView() {
		return "NewFile";
	}
	
}
