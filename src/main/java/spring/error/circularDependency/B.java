package spring.error.circularDependency;

public class B {
	private A a;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(A a) {
		super();
		this.a = a;
	}

	public A getA() {
		return a;
	}
	
}
