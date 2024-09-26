package com.applicationContextAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages= "com.applicationContextAware")
public class BeanProvide {
	
	@Bean
	public SingletonBean getSingletonBean() {
		SingletonBean bean = new SingletonBean();
		return bean;
	}
	
//	   @Bean
//	   @Scope("prototype")
//	    public PrototypeBean getMyPrototypeBean() {
//		PrototypeBean prototype = new PrototypeBean();
//		prototype.setA(34);
//		return prototype;
//	}
}
