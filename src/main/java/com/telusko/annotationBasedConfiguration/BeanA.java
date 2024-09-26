package com.telusko.annotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class BeanA {

	private BeanB beanb;

	public BeanA() {
		super();
		System.out.println("BeanA created");
	}

	public BeanB getBeanb() {
		return beanb;
	}

	@Autowired
	public void setBeanb(BeanB beanb) {
		this.beanb = beanb;
	}

	@Override
	public String toString() {
		return "BeanA [beanb=" + beanb + "]";
	}

}
