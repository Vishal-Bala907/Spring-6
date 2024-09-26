package com.telusko.annotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireAndNoXML {
	
	public static void main(String[] args) {
		ApplicationContext context = new  AnnotationConfigApplicationContext(ConfigurationClass.class);
		BeanA bean = context.getBean("beanA",BeanA.class);
		System.out.println(bean);
		
	}
}
