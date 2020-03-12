

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

import propertiesFile.ReadPropertiesFile;

public class readingPropertiesFileInToClass {
	
	@Test
	public void flightbookings() throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", ReadPropertiesFile.PropFile("chromeLoc"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadPropertiesFile.PropFile("harveyNomranUrl"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		
	//	System.out.println(ReadPropertiesFile.PropFile("chromeLoc"));
			
		
	}

	
	
	
	}


	

