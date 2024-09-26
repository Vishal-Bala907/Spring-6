package com.spring.removeXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.removeXml")
public class BeanProvider {

	@Bean
	public NoXMLBean getBeanA() {
		NoXMLBean bean = new NoXMLBean();
		bean.setX(45);
		bean.setY("vishal bala");
		return bean;
	}   

}
