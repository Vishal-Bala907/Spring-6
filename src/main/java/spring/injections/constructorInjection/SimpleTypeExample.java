package spring.injections.constructorInjection;

public class SimpleTypeExample {

	private final int years;
	private final String ultimateAnswer;

	public SimpleTypeExample(int years, String ultimateAnswer) {
		super();
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}

	public int getYears() {
		return years;
	}

	public String getUltimateAnswer() {
		return ultimateAnswer;
	}

}
