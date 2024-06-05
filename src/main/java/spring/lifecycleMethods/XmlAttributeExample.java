package spring.lifecycleMethods;

public class XmlAttributeExample {
	private boolean waht;

	public boolean isWaht() {
		return waht;
	}

	public void setWaht(boolean waht) {
		this.waht = waht;
	}
	

	public void initBean() {
		System.out.println("init Lifecylce method using xml attribute");
	}
	

	public void destroyBean() {
		System.out.println("destroy Lifecylce method using xml attribute");
	}
}
