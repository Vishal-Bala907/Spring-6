package com.spring.removeXml;

import org.springframework.stereotype.Service;

@Service
public class NoXMLBean {
	private int x;
	private String y;
	

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
}
