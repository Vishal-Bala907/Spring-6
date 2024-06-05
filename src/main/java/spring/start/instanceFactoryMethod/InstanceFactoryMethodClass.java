package spring.start.instanceFactoryMethod;

public class InstanceFactoryMethodClass {

	public Bean1 getBean1() {
		return new Bean1();
	}

	public Bean2 getBean2() {
		return new Bean2();
	}

}
