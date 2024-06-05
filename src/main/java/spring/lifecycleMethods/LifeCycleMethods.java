package spring.lifecycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethods {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/lifecycleMethods/lifecycle.xml");
		InterfaceExample bean = context.getBean(InterfaceExample.class, "life");
		System.out.println(bean.getNumber());
		
		
		XmlAttributeExample bean2 = context.getBean(XmlAttributeExample.class , "xml");
		System.out.println(bean2.isWaht());
	}

}
