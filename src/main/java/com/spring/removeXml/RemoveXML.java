package com.spring.removeXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/*
 *  To auto detect these classes and register the corresponding beans, you need to add @ComponentScan to
 your @Configuration class, where the basePackages attribute is a common parent package for the two
 classes. (Alternatively, you can specify a comma- or semicolon- or space-separated list that includes
 the parent package of each class.)
 * 
 * */
public class RemoveXML {
	@Autowired
	static NoXMLBean noXMLBean;
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanProvider.class);
//		NoXMLBean bean = context.getBean("getBeanA", NoXMLBean.class);
//		System.out.println(bean.getX())
		System.out.println(noXMLBean.hashCode());
	} 
}
