package seleniumHarveyNorm;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class getAttribute3 {
	@Test
	public void Weblist() throws IOException, InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
	
			
		
		//Get the URL through browser
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//Making harveynorman webpage to load for 10 minitues before clicking on it.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Clicking on the first element on harveynorman website
		
	//creating the List of the webelement on echoecho website page.
		
		List<WebElement> attributelink =  driver.findElements(By.name("radio1"));
		//System.out.println(attributelink);
		
		
		//getting the size of the attributelink 
		int size1 = attributelink.size();
		
		
		System.out.println(size1);
		
		attributelink.get(0).click();
		
		
		//using for loop to get the webelement from first radio button to last radio button
		
		for(int m=0;m<=size1;m++) {
			
			attributelink.get(m).click();
		Thread.sleep(5000);
			
		}
	//driver.close();
	
	}
}
