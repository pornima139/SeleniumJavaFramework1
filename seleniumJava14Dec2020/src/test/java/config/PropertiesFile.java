package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import seleniumJava14Dec2020.*;

public class PropertiesFile {
    static Properties prop=new Properties();
    static String projectPath=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties()
	{
		try {
		
		projectPath=System.getProperty("user.dir");
		InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		googleSearchTest_TestNG.browserName=browser;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties()
	{
		try {
			OutputStream output=new FileOutputStream( projectPath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.setProperty("name", "googleSearch");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
