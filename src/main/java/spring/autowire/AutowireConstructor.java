package spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireConstructor {
	private String name;
	private  BeanB beanb;
	
	@Autowired
	public AutowireConstructor(String name, BeanB beanb) {
		super();
		this.name = name;
		this.beanb = beanb;
	}
	public String getName() {
		return name;
	}
	public BeanB getBeanb() {
		return beanb;
	}
	
	
}
