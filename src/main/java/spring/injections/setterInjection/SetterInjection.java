package spring.injections.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/injections/setterInjection/injection.xml");
		
		ExampleBean bean = context.getBean(ExampleBean.class , "third");
		
		System.out.println(bean);
	}
}
