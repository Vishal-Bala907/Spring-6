package com.applicationContextAware;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeBean {
	private int a;

	public PrototypeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrototypeBean(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
