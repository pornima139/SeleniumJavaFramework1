package demo;

import java.util.concurrent.TimeUnit;
    
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception
	{
		
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromeD\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(2, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement linkelement=driver.findElement(By.xpath("//span[normalize-space()='American-Born Confused Desi - Wikipedia']"));
			       if(linkelement.isEnabled())
			       {
			    	   System.out.println("Element found...");
			       }
				return linkelement;
			       
			     }
			     
			   });
			   element.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
	
}
