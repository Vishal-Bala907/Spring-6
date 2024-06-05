package spring.injections.constructorInjection;

public class BeanNeeded {

	private FirstBean bean1;
	private SecondBean bean2;

	public BeanNeeded(FirstBean bean1, SecondBean bean2) {
		super();
		this.bean1 = bean1;
		this.bean2 = bean2;
	}

	public FirstBean getBean1() {
		return bean1;
	}

	public SecondBean getBean2() {
		return bean2;
	}

}
