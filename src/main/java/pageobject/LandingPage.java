package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By Loginpage = By.cssSelector("nav[class = 'pull-right'] ul li:nth-child(4)");

	private By text = By.cssSelector("div[class ='text-center']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Homepagelogin() {
		return driver.findElement(Loginpage);
	}

	public WebElement TextDetails() {
		return driver.findElement(text);
	}
}
