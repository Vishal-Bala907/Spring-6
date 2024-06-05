package spring.start.instanceFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  In Spring documentation, "factory bean" refers to a bean that is configured in the
 	Spring container and that creates objects through an instance or static factory
 	method. By contrast, FactoryBean (notice the capitalization) refers to a Spring
	specific FactoryBean implementation class.
 * 
 * 
 * */

public class InstanceFactoryMethod {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/start/instanceFactoryMethod/instanceFactoryMethod.xml");

		Bean1 bean1 = context.getBean(Bean1.class, "bean1Invoker");
		Bean2 bean2 = context.getBean(Bean2.class, "bean2Invoker");

		System.out.println(bean1.getId());
		System.out.println(bean2.getName());

//		;
		System.out.println(context.getType("bean1Invoker"));
	}
}
