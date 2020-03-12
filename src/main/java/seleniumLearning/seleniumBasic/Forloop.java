package seleniumLearning.seleniumBasic;

import org.junit.Test;

public class Forloop {

	
	
	public void looplearning() {
		
		for(int i=10;i<=20;i++)
		
		System.out.println("Value of i "+i);
	}
		
		@Test
	public void ifelsestring() {
		
		String browser = "Mahi";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("These is a chrome browser");
		}
		else {
			System.out.println("These is IE");
		}
	}
	
}
