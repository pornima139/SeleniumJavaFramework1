package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver=null;
	String projectpath=System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("The browsername is: "+browserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());
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
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",projectpath+"/drivers/chromeD/ie.exe");
			driver=new InternetExplorerDriver();
		}
	}
	@Test
	public void test1() throws Exception
	{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	public void tearDown()
	{
		driver.close();
		System.out.println("test completed successfully");
	}
}
