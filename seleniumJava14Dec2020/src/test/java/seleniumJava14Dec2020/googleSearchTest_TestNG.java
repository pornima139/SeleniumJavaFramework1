package seleniumJava14Dec2020;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;
import pages.GoogleSearchPage;

public class googleSearchTest_TestNG
{
	 WebDriver driver=null;
	private static Logger logger= LogManager.getLogger(Log4jDemo.class);
	public static String browserName=null;
	
	
	@BeforeTest
	public void setUpTest()
	{
				String projectpath=System.getProperty("user.dir");
				PropertiesFile.getProperties();
				if(browserName.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromeD/chromedriver.exe");
					driver=new ChromeDriver(); 
				}
				else if(browserName.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver",projectpath+"/drivers/chromeD/geckodriver.exe");
					driver=new FirefoxDriver(); 
				}
				logger.info("Browser started");
	}
	 
	@Test
	public void googlesearch() {
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		logger.info("navigated to google");
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		GoogleSearchPage.search_Button(driver).sendKeys(Keys.RETURN);
		/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("Test scuccessfull");
		driver.close();
		driver.quit();
		PropertiesFile.setProperties();
	}
}

