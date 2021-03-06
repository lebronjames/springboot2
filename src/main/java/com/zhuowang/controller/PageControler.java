package com.zhuowang.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageControler {
	
	// 从 application.properties 中读取配置，如取不到默认值为Hello lebron
		@Value("${application.hello: Hello lebron}")
		private String name = "lebron james";

	/**
	 * 设置默认页
	 * @RequestMapping("/") 和 @RequestMapping 是有区别的
	 * 如果不写参数，则为全局默认页，加入输入404页面，也会自动访问到这个页面。
	 * 如果加了参数“/”，则只认为是根页面。
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"/","/index"})
	public String index(Map<String,Object> model){
		//直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
		//本例为 /WEB-INF/jsp/index.jsp
		model.put("time", new Date());
		model.put("message", this.name);
		return "index";
	}
	
	/**
	 * 响应到JSP页面page1
	 * @return
	 */
	@RequestMapping("/page1")
	public ModelAndView page1(){
		ModelAndView mav = new ModelAndView("page/page1");
		mav.addObject("content", this.name);
		return mav;
	}
}
