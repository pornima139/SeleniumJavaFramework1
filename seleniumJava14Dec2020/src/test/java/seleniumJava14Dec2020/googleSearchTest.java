package seleniumJava14Dec2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class googleSearchTest
{
	private static WebDriver driver=null;
	public static void main(String[] args)	
	{
		
		googleSearch();
	}

public static void googleSearch() {

		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromeD/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		GoogleSearchPage.search_Button(driver).sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test scuccessfull");
		driver.close();
	}
}

