package HomeWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverwithclick {
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
	     Thread.sleep(5000);
	     
	  // driver.findElement(By.xpath("//span[contains(text(),'Smart Home')]")).click();;
	 	
			//To get the mover  hover you need to Instanttiate Actions Class
	     		Actions actions = new Actions(driver);
	     
				WebElement smartHome = driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/div/div/ul/li[7]/span"));
			
			// Mouse hover menu options
		   actions.moveToElement(smartHome).perform();;
		   Thread.sleep(2000);
		   
		//   WebElement applepod = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/ul/li[7]/ul/li[3]/ul[1]/li[1]/strong"));
		  // actions.moveToElement(applepod).build().perform();
		   
		   driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/ul/li[7]/ul/li[3]/ul[1]/li[1]/ul/li[3]/a")).click();;
		
		   //		Thread.sleep(1000);
		 ///a[contains(text(),'Apple Homepod')]
			// Selecting Apple Homepod 
		//		WebElement appleHomepod = driver.findElement(By.xpath("//a[contains(text(),'Apple Homepod')]"));
		//		actions.moveToElement(appleHomepod).perform();;
			

}}

