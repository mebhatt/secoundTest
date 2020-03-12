package seleniumHarveyNorm;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc01_navigatetoharveynormanwebsite {

	@Test
	public void nav_hu() {
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.harveynorman.com.au");
	}
	
	

	
}
