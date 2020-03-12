package seleniumHarveyNorm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class TryandCatch {
	@Test
	public void Weblist() throws IOException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
		//Try and catch system to catch the error eventhough it will show that test has pass and show the catch statment error in console(output).
		try {
			
		
		//Get the URL through browser
		driver.get("https://www.harveynorman.com.au");
		
		//Making harveynorman webpage to load for 10 minitues before clicking on it.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Clicking on the first element on harveynorman website
		//Element is not there so i will through the catch statment error (Element not found) insted of falling it.
		
		driver.findElement(By.xpath("//*[@id=\"category-grid\"]/div[1]/div/div[1]/a/im")).click();
	// 
		}
		catch (Exception e) {
			System.out.println("Element not found");
		}
		
		
	driver.close();
	}
}
