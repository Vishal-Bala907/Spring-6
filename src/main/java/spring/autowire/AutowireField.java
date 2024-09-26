package spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireField {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/autowire/autowire.xml");
		BeanA beanA = context.getBean(BeanA.class, "beanA");
		System.out.println(beanA.getB().getName());

		System.out.println("Autowire constructor");
		AutowireConstructor constructor = context.getBean(AutowireConstructor.class, "autowireConstructor");
		System.out.println(constructor.getBeanb().getName());

		// we can also use @Autowired annotation on setters

	}
}
