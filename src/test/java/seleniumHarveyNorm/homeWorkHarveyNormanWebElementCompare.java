package seleniumHarveyNorm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class homeWorkHarveyNormanWebElementCompare {
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
		
		//Clicking on the first element on harveynorman website contact us menu tab
		
	//	String contactus = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[6]/a")).getAttribute("text");
		
		
	//	System.out.println(contactus);
		
		//with condition of text contact us found than will click the contact us tab.
		
	//	if (contactus.equalsIgnoreCase("Contact usContact us")) {
	//		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[6]/a")).click();;
	//	}
		
		
		
		
	//Thread.sleep(10000);
		
		//span[contains(text(),'Smart Home')]
	//	.click();
	//	Thread.sleep(10000);
		
		
	//Selecting Compare check box of the different products	
		
	//	List<WebElement> product =  driver.findElements(By.xpath("//a[@class='icn icn-compare']"));
	//	Thread.sleep(2000);
	//	System.out.println("Number of Link: "+ product.size());
		
		
	//	Thread.sleep(5000);
		
	//	int size1 = product.size();
		
	//	product.get(0).click();
		
		//Putting loop from 4 to 5 index to select compare box.
	//	for (int i=4;i<=5;i++) {
	//		product.get(i).click();
	//		Thread.sleep(10000);
	//		System.out.println(i);
			
		}
		
		
		
		
		//for (WebElement compare : product) {
			
		//	String compare1 = compare.click();
			
		//	System.out.println(compare1);
		//}
		
		
		
		 
		 
		//Adding item in product list
		
		
		//get the size of product list
		
		//int size1 = product.size();
		
		//System.out.println(attributelink);
		
	//	System.out.println(size1);
		
	//	product.get(0).click();
		
		
		//using for loop to get the webelement from first radio button to last radio button
		
//	for(int m=0;m<=size1;m++) {
	//		
	//	product.get(m).click();
	//		Thread.sleep(5000);
			
		}

	//driver.close();
	
	


