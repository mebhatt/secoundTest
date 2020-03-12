package seleniumLearning.seleniumBasic;

import org.junit.Test;

public class Elseifcondition {
	
	
	@Test
	
	
	public void ifelse() {
		
	
	String m = "borwser is good";
	
	if(m.equalsIgnoreCase("chrome")) {
		
		System.out.println("These is chromebroser");
	}
	else if (m.equalsIgnoreCase("Firfox")) {
		
		System.out.println("These is Firfox");
	}
	else if (m.equalsIgnoreCase("IE")) {
		
		System.out.println("These is IE");
	}
	else {
		System.out.println("nothig find");
	}
}
}