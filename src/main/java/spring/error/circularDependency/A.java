package spring.error.circularDependency;

public class A {
	private B b;

	public A(B b) {
		super();
		this.b = b;
	}

	public B getB() {
		return b;
	}
	
}
