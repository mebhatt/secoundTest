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

public class Verifypagetitle {

	@Test
	public void verifypagetitle1() throws IOException {
	
		
		
		System.setProperty("webdriver.chrome.driver" , "/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/driver/chromedriver");
		//Driver object created 
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window after launching google chrome
		driver.manage().window().maximize();
		
		//Get the URL through browser
		driver.get("https://www.harveynorman.com.au");
		
		//Get title of the URL Page
		String title = driver.getTitle();
		
		//Out put the object title
		System.out.println(title);
		
		//comparing Expected outcome with the actual outcome
	String Actualresult =	"Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
	Assert.assertEquals(title, Actualresult);
	
	//to close the chrome after finishing process
	driver.close();
	
	//Finding the particular keyword from the actualresult.
	Assert.assertTrue(Actualresult.contains("Shop"));
	
	
	//Take the Screen shoot and copy in to the file and store it to specific location
	
		File screenshootfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshootfile, new File ("/seleniumBasic/src/test/java/seleniumHarveyNorm/screenshot.png"));
	}
}
