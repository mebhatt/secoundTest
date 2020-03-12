package HomeWork;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flightCentre {
	
	@Test
	public void flightbooking() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/montybhatt/eclipse-workspace/phanthom/src/main/java/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flightcentre.com.au/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//Click From Flight Menu
		driver.findElement(By.xpath("//*[@id=\"downshift-0-input\"]")).click();;
		Thread.sleep(2000);
	
		
		//Select Melbourne from the drop down menu 
		driver.findElement(By.xpath("//*[@id=\"downshift-0-item-1\"]/div/div[2]/p")).click();;
		Thread.sleep(1000);
		
		//Clicking Flight to
		driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]")).click();;
		Thread.sleep(1000);
		
		//Selecting Auckland
		driver.findElement(By.xpath("//*[@id=\"downshift-1-item-7\"]/div/div[2]/p")).click();;
		Thread.sleep(1000);
		
		
		//Clicking From date(Departer Date)
		driver.findElement(By.name("departDate")).click();;
		Thread.sleep(2500);
	
		//Clicking the arrow to change the month
		driver.findElement(By.xpath("//div[2]/div[1]/button[2][@tabindex='0']")).click();
		Thread.sleep(1500);
		
		//Selecting departer date
		driver.findElement(By.xpath("//span[1][contains(text(),'10')]")).click();;
		Thread.sleep(1000);
		
		//Selecting departer date
	//			driver.findElement(By.xpath("//span[1][contains(text(),'10')]")).click();;
				//Thread.sleep(1000);
				
		//Selecting return date by clicking arrow for next month
		
		driver.findElement(By.xpath("//div[2]/div[1]/button[2][@tabindex='0']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[2]/div[1]/button[2][@tabindex='0']")).click();
		Thread.sleep(1000);
		//select return date
		driver.findElement(By.xpath("\"//span[1][contains(text(),'10')]")).click();
		
		
		//Select date from the JavaScript Calender through javascript executor (Through Creating selectDateByJs Method down under
		
		//WebElement date = driver.findElement(By.xpath("//*[@id=\"mini-panel-fcc_homepage_banner\"]/div[2]/div/div/div/div/div/div/div/form/div/div/div[4]/div/div[2]/div/div/div/input"));
		//date.click();
	//	String dateVal = "01-02-2020";
		
		//selectDateByJs(driver,date,dateVal);
		
		
		
		
		
	//	driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div[1]")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div[1]/div[2]/div[1]/button[2]/span[1]/svg")).click();
		
	//	WebElement  fromDate =  driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div[1]"));
	//	fromDate.click();
	
	//	SelectDayFromMultiDateCalendar("3");
	//	By calendarXpath = By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']");
	//	/html/body/div[17]/div[2]/div/div[1]/div[2]/div[1]/button[2]/span[1]/svg
		driver.close();
	}

	
	//private void selectDateByJs(WebDriver driver, WebElement element, String dateVal) {
	//	JavascriptExecutor js = ((JavascriptExecutor)driver);
	//	js.executeScript("arguments[0].setAttribute('value',"+dateVal+"');",element);
		
	
	}


	

