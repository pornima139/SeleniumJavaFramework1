package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pornima\\eclipse-workspace\\seleniumJava14Dec2020\\drivers\\chromeD\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("uploaded_file"));
		ele.click();
		Runtime.getRuntime().exec("G:\\fileuploadscript.exe");
		Thread.sleep(3000);
		//driver.close();
		
		
	}
}
