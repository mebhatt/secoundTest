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

public class getAttribute {
	@Test
	public void Weblist() throws IOException, InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
	
			
		
		//Get the URL through browser
		driver.get("https://www.harveynorman.com.au");
		
		//Making harveynorman webpage to load for 10 minitues before clicking on it.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Clicking on the first element on harveynorman website
		
		//it will get the attribute (Account) property "href" in first line and "text" in second line.
	
		String attributelink = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).getAttribute("href");
		System.out.println(attributelink);
		
		//attributename will hold the Text value as Account.
		String attributename = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).getAttribute("text");
		System.out.println(attributename);
		
		
		//if the attributename holds name as account then click on it
		if (attributename.equalsIgnoreCase("Account")) {
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		}
		
	Thread.sleep(10000);
		driver.close();
		
	}
}
