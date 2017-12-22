package com.zhuowang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//1. 使用代码注册Servlet（不需要@ServletComponentScan注解）
//代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。 
//也可以通过实现 ServletContextInitializer 接口直接注册。
//@SpringBootApplication
//public class Springboot2Application {
//	
//	/**
//	 * 1. 使用代码注册Servlet（不需要@ServletComponentScan注解）
//	 * @return
//	 */
//	@Bean
//	public ServletRegistrationBean servletRegistrationBean(){
//		// ServletName默认值为首字母小写，即myServlet(http://localhost:8080/xs/myServlet)
//		return new ServletRegistrationBean(new MyServlet(),"/xs/*");
//	} 

///**
// * 修改DispatcherServlet默认配置
// */
//@Bean
//public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//    ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//    registration.getUrlMappings().clear();
//    registration.addUrlMappings("*.do");
//    registration.addUrlMappings("*.json");
//    return registration;
//}

//
//	public static void main(String[] args) {
//		SpringApplication.run(Springboot2Application.class, args);
//	}
//}

//2. 使用@ServletComponentScan 注解注册Servlet
//在 SpringBootApplication 上使用@ServletComponentScan 注解后，
//Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。

@SpringBootApplication
@ServletComponentScan
public class Springboot2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}
}
