package spring.lifecycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;

public class InterfaceExample implements InitializingBean , DisposableBean  {
	private int number;
	public InterfaceExample() {
		// TODO Auto-generated constructor stub
	}
	public InterfaceExample(int number) {
		super();
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying bean using the DisposableBean interface");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean using the InitializingBean interface");
		
	}
	

	
}
