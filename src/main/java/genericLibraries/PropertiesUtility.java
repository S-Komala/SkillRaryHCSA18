package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;
/**
 * This class contains reusable methods to perform actions on properties file
 * @param key
 * @return
 */

public class PropertiesUtility {
	private Properties property;
	/**
	 * This method is used to initialize Properties file
	 * @param filePath
	 */
	public void propertiesInitialization(String filePath) {
		FileInputStream fis=null;
		try {
		   fis=new FileInputStream(filePath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	property=new Properties();
	try {
		property.load(fis);
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
	}
	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 */
     public String fetchProperty(String key) {
     return property.getProperty(key);
}
}

