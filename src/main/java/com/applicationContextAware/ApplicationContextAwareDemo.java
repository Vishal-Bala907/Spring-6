package com.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextAwareDemo {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"/com/applicationContextAware/applicationcontextaware.xml");
//		SingletonBean bean = context.getBean("sing",SingletonBean.class);
//		System.out.println(bean.getPrototypeBean().hashCode());
//		System.out.println(bean.getPrototypeBean().hashCode());
//		System.out.println(bean.getPrototypeBean().hashCode());
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanProvide.class);
		
		SingletonBean bean = context.getBean("singletonBean",SingletonBean.class);
		System.out.println(bean.getPrototypeBean().hashCode());
		System.out.println(bean.getPrototypeBean().hashCode());
		System.out.println(bean.getPrototypeBean().hashCode());
	}
}
