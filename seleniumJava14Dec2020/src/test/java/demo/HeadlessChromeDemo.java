package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test();
	}
	public static void test()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pornima\\eclipse-workspace\\seleniumJava14Dec2020\\drivers\\chromeD\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200,800");
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		System.out.println("completed");
		
	}
}
