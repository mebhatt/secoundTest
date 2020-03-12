package seleniumLearning.seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Hello world!
 *
 */
public class App {
	
	@Test
    public void main()
    {
System.setProperty("webdriver.gecko.driver", "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/geckodriver.exe ");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flightcentre.com.au/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        System.out.println( "Hello World!" );
    }
}
