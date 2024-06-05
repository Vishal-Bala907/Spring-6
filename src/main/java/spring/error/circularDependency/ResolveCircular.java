package spring.error.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResolveCircular {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/error/circularDependency/circular.xml");
		
		A a = context.getBean(A.class,"a");
		System.out.println(a);
	}
}
