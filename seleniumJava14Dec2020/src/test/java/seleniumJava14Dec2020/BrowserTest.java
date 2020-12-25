package seleniumJava14Dec2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args)	 {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromeD/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//input[@title=\"search\"]"));
		textbox.sendKeys("abc");
		List <WebElement> listofelements=driver.findElements(By.xpath("//input"));
		int count=listofelements.size();
		System.out.println("count= "+count);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}

}
