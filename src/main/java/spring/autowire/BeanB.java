package spring.autowire;

public class BeanB {
	private String name;

	public BeanB() {
		super();
		System.out.println("Creating Bean B");
	}

	public BeanB(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
