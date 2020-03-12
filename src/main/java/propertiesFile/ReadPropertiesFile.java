package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;



public class ReadPropertiesFile {
	static Properties property;
	static FileInputStream fs;
	//
	@Test
	public static String PropFile(String PropName)  {
	try {
		//user.dir (To get the path upto the package see (DefaultPackage/userdir.java for understanding of path)
	fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/propertiesFile/properties.Properties");
		
	//	fs = new FileInputStream("/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/propertiesFile/properties.Properties");	
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	property = new Properties();
	try {
	property.load(fs);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	// System.out.println(property.getProperty("PropName"));
	return property.getProperty(PropName);
	}
	}
	
	
	
	

