package com.zhuowang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	// 从 application.properties 中读取配置，如取不到默认值为Hello lebron
	@Value("${application.hello: Hello lebron}")
	private String name = "lebron james";
	
	@RequestMapping("/page1")
	public ModelAndView page1(){
		ModelAndView mav = new ModelAndView("page/page1");
		mav.addObject("content", this.name);
		return mav;
	}
	
	@RequestMapping("/world")
	@ResponseBody
	public String world(){
		return "Hello World";
	}
}
