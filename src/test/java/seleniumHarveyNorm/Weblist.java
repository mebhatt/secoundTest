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

public class Weblist {
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
		
		driver.findElement(By.xpath("//*[@id=\"category-grid\"]/div[1]/div/div[1]/a/img")).click();
		
		Select Warranty = new Select(driver.findElement(By.id("select_999999900")));
		
		Warranty.selectByIndex(3);
		
		
		//Selecting the element from the text (Dropdown menu and select by text
		Select Warrantys = new Select(driver.findElement(By.id("select_999999900")));
		
		//To select warranty through the visible text.
		Warrantys.selectByVisibleText("1 year Product Care Replacement");
		
		
		//Selecting All dropdown menu iteams
		
		Select Warrantys1 = new Select(driver.findElement(By.id("select_999999900")));
		for(int i=0;i<=3;i++) {
		System.out.println(Warrantys1.getOptions().get(i).getText());
			
		Thread.sleep(5000);
		
		
		//*[@id="category-grid"]/div[1]/div
		//*[@id="category-grid"]/div[1]/div/div[1]/a
		
		
		
	}
	}
}
