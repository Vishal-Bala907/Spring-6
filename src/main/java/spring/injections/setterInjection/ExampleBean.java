package spring.injections.setterInjection;

public class ExampleBean {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;

	private ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.i = i;
	}

	// static factory method
	public static ExampleBean createInstance(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
		System.out.println("FACTORY");
		return new ExampleBean(beanOne, beanTwo, i);
	}

	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}

	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}

	public void setI(int i) {
		this.i = i;
	}

	public AnotherBean getBeanOne() {
		return beanOne;
	}

	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}

	public int getI() {
		return i;
	}

}
