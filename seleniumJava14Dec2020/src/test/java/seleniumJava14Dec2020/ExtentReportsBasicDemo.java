package seleniumJava14Dec2020;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		start extentReporter
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
		//creates extentReporter and attach 
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//start to create test and 
		ExtentTest test=extent.createTest("Google Search","first test to search google");
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromeD/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(Status.INFO, "starting test case");
		
		driver.get("https://www.google.com/");
		test.pass("navigated to google");
		driver.findElement(By.name("q")).sendKeys("automation jobs");
		test.pass("Entered searched details in textbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("clicked searched button");
		driver.close();
		driver.quit();
		test.pass("driver closed");
		test.info("test completed");
		//calling flush writes everything to the log file
		extent.flush();
	}

}
