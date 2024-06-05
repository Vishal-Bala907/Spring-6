package spring.namespaces;

public class CNameSpace {
	private Hello hello;
	private String name;

	public CNameSpace() {
		// TODO Auto-generated constructor stub
	}

	public CNameSpace(Hello hello, String name) {
		super();
		this.hello = hello;
		this.name = name;
	}

	public Hello getHello() {
		return hello;
	}

	public String getName() {
		return name;
	}

}
