package spring.lifecycleMethods;

public class AnnotationExample {
	
	private String name;

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@PostConstruct
	public void initBean() {
		System.out.println("init Lifecylce method using annotation");
	}
	
//	@PreDestroy
	public void destroyBean() {
		System.out.println("destroy Lifecylce method using annotation");
	}

}
