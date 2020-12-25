package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver=null;
	By textbox_search=By.name("q");
	By button_search=By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setTextinTextbox(String text) 
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void click_Button_search()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
