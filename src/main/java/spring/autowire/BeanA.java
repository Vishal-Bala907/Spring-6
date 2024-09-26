package spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	private int n;
	
	@Autowired
	private BeanB b;

	public BeanA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanA(int n, BeanB b) {
		super();
		this.n = n;
		this.b = b;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public BeanB getB() {
		return b;
	}

	public void setB(BeanB b) {
		this.b = b;
	}

}
