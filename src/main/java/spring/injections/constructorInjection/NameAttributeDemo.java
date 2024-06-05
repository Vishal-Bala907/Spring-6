package spring.injections.constructorInjection;

import java.beans.ConstructorProperties;

/*
 *  Keep in mind that, to make this work out of the box, your code must be compiled 
 *  with the debug flag enabled so that Spring can look up the parameter name from the 
 *  constructor. If you cannot or 	25 do not want to compile your code with the debug 
 *  flag, you can use the @ConstructorProperties JDK annotation to explicitly name 
 *  your constructor arguments. The sample class would then have to
 * 
 * */
public class NameAttributeDemo {
	private final int years;
	private final String ultimateAnswer;

	@ConstructorProperties({"years","ultimateAnswer"})
	public NameAttributeDemo(int years, String ultimateAnswer) {
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
