package seleniumJava14Dec2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageObjectTest {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		test();
	}
	public static void test()
	{
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromeD/chromedriver.exe");
		driver=new ChromeDriver();
		
		GoogleSearchPageObject obj=new GoogleSearchPageObject(driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); 
		obj.setTextinTextbox("automation step by step");
		obj.click_Button_search();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();  
	}
}
