package spring.start.staticFactoryMethod;

public class StaticFactoryMethodClass {

	private static StaticFactoryMethodClass object = new StaticFactoryMethodClass();

	private int prop1;
	private String prop2;

	private StaticFactoryMethodClass() {
		super();
		System.out.println("instance created");
		// TODO Auto-generated constructor stub
	}

//	static factory method
	public static StaticFactoryMethodClass createInstance() {
		return object;
	}

	public int getProp1() {
		return prop1;
	}

	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

}
