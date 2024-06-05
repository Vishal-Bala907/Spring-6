package spring.start.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*IoC is also known as dependency injection (DI). It is a process whereby objects define
 their dependencies (that is, the other objects they work with) only through constructor arguments,
 arguments to a factory method, or properties that are set on the object instance after it is
 constructed or returned from a factory method
 
 
 The BeanFactory interface provides an advanced configuration
 mechanism capable of managing any type of object. ApplicationContext is a sub-interface of
 BeanFactory. It adds:
 
 In short, the BeanFactory provides the configuration framework and basic functionality, and the
 ApplicationContext adds more enterprise-specific functionality.
 
  In Spring, the objects that form the backbone of your application and that are managed by the
 Spring IoC container are called beans. 
 
 A bean is an object that is instantiated, assembled, and
 managed by a Spring IoC container. 
 
  The org.springframework.context.ApplicationContext interface represents the Spring IoC container
 and is responsible for instantiating, configuring, and assembling the beans.
 
 In stand
alone applications, it is common to create an instance of ClassPathXmlApplicationContext or
 FileSystemXmlApplicationContext. 
 * 
 * 
 * */
public class SpringStartBasics {
	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			/*
			 * Within the container itself, these bean definitions are represented as
			 * BeanDefinition objects, which contain (among other information) the following
			 * metadata:
			 * 
			 * • A package-qualified class name: typically, the actual implementation class
			 * of the bean being defined.
			 * 
			 * • Bean behavioral configuration elements, which state how the bean should
			 * behave in the container (scope, lifecycle callbacks, and so forth).
			 * 
			 * • References to other beans that are needed for the bean to do its work.
			 * These references are also called collaborators or dependencies.
			 * 
			 * • Other configuration settings to set in the newly created object — for
			 * example, the size limit of the pool or the number of connections to use in a
			 * bean that manages a connection pool
			 */
			context = new ClassPathXmlApplicationContext("spring-start-basic.xml");
			DemoBean demoBean = context.getBean(DemoBean.class, "first");
			System.out.println(demoBean.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

//		Using aliases
//		DemoBean demoBean = context.getBean(DemoBean.class, "first");
//		System.out.println(demoBean.toString());
	}

}
