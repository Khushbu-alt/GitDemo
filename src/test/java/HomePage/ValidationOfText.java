package HomePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Academy.Base;
import pageobject.LandingPage;

public class ValidationOfText extends Base {

	public WebDriver driver;
	
	@Test
	public void Pagenevigation() throws IOException {
		
		try
		{
		driver = initializedriver();

		driver.get("http://www.qaclickacademy.com");
	
		LandingPage lpage = new LandingPage(driver);
		Assert.assertEquals(lpage.TextDetails().getText(), "FATURED COURSES");
		}
		
		finally
		{
			driver.close();
		}
		
}
	
	
}
