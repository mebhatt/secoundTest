package seleniumLearning.seleniumBasic;

import static org.junit.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UntitledTestCase {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flightcentre.com.au/");
		//baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	 //   driver.get("https://www.google.com/search?q=flight+centre&oq=f&aqs=chrome.0.69i59j69i57j69i59j35i39j69i61j69i60j69i61j69i60.1988j0j7&sourceid=chrome&ie=UTF-8");
	 //   driver.findElement(By.xpath("//a[@id='vn1s0p1c0']/h3")).click();
	   Thread.sleep(1000);
		  driver.findElement(By.id("downshift-0-input")).click();
	    driver.findElement(By.xpath("//li[@id='downshift-0-item-1']/div/div/h6")).click();
	    driver.findElement(By.id("downshift-1-input")).click();
	    driver.findElement(By.xpath("//li[@id='downshift-1-item-7']/div/div/h6")).click();
	    driver.findElement(By.linkText("DISMISS")).click();
	    driver.findElement(By.name("departDate")).click();
	    driver.findElement(By.xpath("//div[3]/div/div[2]/div/button/span")).click();
	    driver.findElement(By.xpath("//div[5]/div[4]/button/span")).click();
	    driver.findElement(By.xpath("//input[@name='']")).click();
	    driver.findElement(By.cssSelector("button.jss67.jss240.jss242.incrementor__add > span.jss245 > svg.jss70.jss77 > path")).click();
	    driver.findElement(By.xpath("//div[3]/button/span")).click();
	    driver.findElement(By.xpath("//div[@id='mini-panel-fcc_homepage_banner']/div[2]/div/div/div/div/div/div/div/form/div/div/div[7]/div/button/span")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
	    driver.findElement(By.id("downshift-0-input")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

