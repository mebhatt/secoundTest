package seleniumHarveyNorm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Screenshotfile {
	@Test
	public void screenshortlearn() throws IOException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
		//Get the URL through browser
		driver.get("https://www.harveynorman.com.au");
		
		
		
		
	//Take the Screen shoot and copy in to the file and store it to specific location
	
		File screenshootfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshootfile, new File ("Users/montybhatt/eclipse-workspace/seleniumBasic/src/test/java/screenshot.png"));
	}
}
