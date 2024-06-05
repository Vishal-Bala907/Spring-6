package spring.namespaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PandCNameSpaces {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/namespaces/namespaces.xml");
		PNameSpace bean = context.getBean(PNameSpace.class, "p");
//		CNameSpace bean2 = context.getBean(CNameSpace.class, "c");
		System.out.println(bean.getI());
		
//		System.out.println(bean2.getName());
	}
}
