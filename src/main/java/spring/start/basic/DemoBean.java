package spring.start.basic;

public class DemoBean {
		private int number;
		private String name;
		private double age;
		private boolean bool;
		public DemoBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public DemoBean(int number, String name, double age, boolean bool) {
			super();
			this.number = number;
			this.name = name;
			this.age = age;
			this.bool = bool;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAge() {
			return age;
		}
		public void setAge(double age) {
			this.age = age;
		}
		public boolean isBool() {
			return bool;
		}
		public void setBool(boolean bool) {
			this.bool = bool;
		}
		@Override
		public String toString() {
			return "DemoBean [number=" + number + ", name=" + name + ", age=" + age + ", bool=" + bool + "]";
		}
		
		
}
