package com.telusko.annotationBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.telusko.annotationBasedConfiguration")
public class ConfigurationClass {

	@Bean
	public BeanB getBeanB() {
		BeanB beanB = new BeanB();
		beanB.setA(100);
		beanB.setName("Vishal bala");
		return beanB;
	}

	@Bean(name = "beanA")
	public BeanA getBeanA() {
		return new BeanA();
	}

}
