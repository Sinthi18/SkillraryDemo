package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * *This class contains all reusable methods to perform operations 
 * @author Admin
 *
 */

public class PropertiesUtility1 {
	private Properties property;
	public void propertiesInit(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);	
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}	
		property = new Properties();
		try {
		    property.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * *This method is used to fetch data from Properties file using key
	 * @param key
	 * @return
	 */

	public String readDataFromProperties(String key) {
		return property.getProperty(key);
	}
	/**
	 * This method is used to write data to Properties file
	 * @param key
	 * @param value
	 * @param filepath
	 * @param comments
	 * 
	 */
	public void writeToProperties(String key,String value,String filepath,String comments) {
		property.put(key, value);
		
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(filepath);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			property.store(fos, comments);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}





