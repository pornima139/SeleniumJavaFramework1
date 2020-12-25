package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits()
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromeD\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250ms
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("dsmsd")));
		driver.findElement(By.name("abc")).click();
		driver.close();
		driver.quit();
		
	}
}
