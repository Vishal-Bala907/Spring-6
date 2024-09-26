package com.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SingletonBean implements ApplicationContextAware {
	ApplicationContext context;


	public SingletonBean() {
		System.out.println("Singleton Bean Instantiated !!");
	}

	public PrototypeBean getPrototypeBean() {
		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		return prototypeBean;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}

}
