package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {

	public WebDriver driver;
	
	private By username = By.id("user_email");
	
	private By Passwd = By.id("user_password");
	
	public LogingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Passwd);
	}

}
