package MouseHover;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHoverandClickOnChild {
	
	public static WebDriver driver;

	@Test
	public void NavigateToHNwebsit() throws InterruptedException{

	//---initiate chromebrowser
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
	//----create and object as driver----------------
	driver = new ChromeDriver();
	//-----maximize browser
	driver.manage().window().maximize();
	//----This line means wait 10 sec-----
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//open HN website
	driver.get("http://harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//Shop all Products---menu--click
	//driver.findElement(By.xpath("//*[@id='shopAllMd']")).click();
	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/div/div/ul/li[7]/span")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// Mouse Over On " your account link " from menu section
	 Actions a1 = new Actions(driver);

	WebElement jagan =  driver.findElement(By.xpath("//*[@id=\"wrapper\"]//span[contains(text(),'Smart Home')]"));
	//  a1.moveToElement(driver.findElement(By.xpath("//*[@id='navMdList']/ul/li[7]/a"))).build().perform();
	 
	 
	 Actions builder = new Actions(driver);  
	 builder.moveToElement(jagan).perform();
	 
	 
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Apple Homepod')]")).click();


	}


	}


