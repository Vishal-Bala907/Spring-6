package spring.injections.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MyBeans {

	ApplicationContext context;

	public MyBeans() {
		super();
		context = new ClassPathXmlApplicationContext("/spring/injections/constructorInjection/injection.xml");
	}

	// reference type
	public void getConstructorArgBeansReference() {
		BeanNeeded bean = context.getBean(BeanNeeded.class, "main");

		System.out.println(bean.getBean1());
		System.out.println(bean.getBean2());
	}

	// simple type
	public void getConstructorArgBeansSimple() {
		SimpleTypeExample bean = context.getBean(SimpleTypeExample.class, "simple");
		System.out.println(bean.getYears() + "\n" + bean.getUltimateAnswer());
	}

	// args passed by index type
	public void getConstructorArgBeansIndex() {
		// TODO uncomment index bean from the xml
		SimpleTypeExample bean = context.getBean(SimpleTypeExample.class, "index");
		System.out.println(bean.getYears() + "\n" + bean.getUltimateAnswer());
	}

	// Constructor name injection
	public void getConstructorArgBeansNameInjection() {
		// TODO uncomment index bean from the xml
		NameAttributeDemo bean = context.getBean(NameAttributeDemo.class, "exampleBean");
		System.out.println(bean.getYears() + "\n" + bean.getUltimateAnswer());
	}

}

public class ConstructorInjection {
	public static void main(String[] args) {
		MyBeans myBeans = new MyBeans();

		System.out.println("Reference type beans with no type attribute");
		myBeans.getConstructorArgBeansReference();

		System.out.println("\nSimple type bean with type attribute");
		myBeans.getConstructorArgBeansSimple();

		System.out.println("\nName injection bean with type @ContructorProperties annotation");
		myBeans.getConstructorArgBeansNameInjection();

	}
}
