package com.spring.customScope;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScopeThread implements Scope {
	
//	CustomThreadLocal customThreadLocal = new CustomThreadLocal();

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		System.out.println("fetched object from scope");
		
//		Map<String, Object> scope = custom
		return null;
	}

	@Override
	public Object remove(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
