package MouseHover;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	@Test
	public void Weblist() throws IOException, InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
	
			
		
		//Get the URL through browser
		driver.get("https://www.harveynorman.com.au/");
		
		//Making harveynorman webpage to load for 10 minitues before clicking on it.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Retrive Smart Home with custome xpath property webelement to perform mouse hover on Apple Homepod
	     
				WebElement smartHome = driver.findElement(By.xpath("//span[contains(text(),'Smart Home')]"));
				
				//To get the mover  hover you need to Instanttiate Actions Class
						Actions actions = new Actions(driver);
			// Mouse hover menu options
				actions.moveToElement(smartHome).perform();;
				Thread.sleep(1000);
				
			// Selecting Apple Homepod 
				WebElement appleHomepod = driver.findElement(By.xpath("//a[contains(text(),'Apple Homepod')]"));
				actions.moveToElement(appleHomepod).perform();;
			

}
}
