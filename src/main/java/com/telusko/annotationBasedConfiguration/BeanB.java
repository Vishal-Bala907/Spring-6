package com.telusko.annotationBasedConfiguration;

import org.springframework.stereotype.Service;

// @Service
public class BeanB {
	private int a;
	private String name;

	public BeanB() {
		super();
		System.out.println("BeanB created");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [a=" + a + ", name=" + name + "]";
	}

}
