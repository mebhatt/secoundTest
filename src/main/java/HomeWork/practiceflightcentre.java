package HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceflightcentre {
	public static WebDriver driver;

	@Test
	public void flight() throws InterruptedException{
		//---initiate chromebrowser
				System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
			//----create and object as driver----------------
			driver = new ChromeDriver();
			//-----maximize browser
			driver.manage().window().maximize();
			//----This line means wait 10 sec-----
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//open HN website
			
		    driver.get("https://www.flightcentre.com.au");
		    driver.findElement(By.id("downshift-0-input")).click();
		    driver.findElement(By.xpath("//li[@id='downshift-0-item-1']/div/div[2]/p")).click();
		    driver.findElement(By.id("downshift-1-input")).click();
		    driver.findElement(By.xpath("//li[@id='downshift-1-item-7']/div/div[2]/p")).click();
		    driver.findElement(By.name("departDate")).click();
		    driver.findElement(By.xpath("//div[2]/div[2]/button/span")).click();
		    driver.findElement(By.xpath("//div[2]/div[3]/button/span")).click();
		    driver.findElement(By.xpath("//input[@name='']")).click();
		    driver.findElement(By.cssSelector("button.jss67.jss240.jss242.incrementor__add > span.jss245 > svg.jss70.jss77")).click();
		    driver.findElement(By.id("select-fareType")).click();
		    driver.findElement(By.xpath("//div[@id='menu-fareType']/div[2]/ul/li[2]")).click();
		    driver.findElement(By.xpath("//div[3]/button/span")).click();
		    driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

}
}
