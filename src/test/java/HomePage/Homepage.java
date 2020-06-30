package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Academy.Base;
import pageobject.LandingPage;
import pageobject.LogingPage;

public class Homepage extends Base {
	public WebDriver driver;
	
public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test(dataProvider="getdata")
	public void Pagenevigation(String username,String Passwd,String text) throws IOException {
		driver = initializedriver();
		log.info("Driver is intialized");
		driver.get("http://www.qaclickacademy.com");
		log.info("Link is open");
		LandingPage Lp = new LandingPage(driver);
		Lp.Homepagelogin().click();
		
		LogingPage l = new LogingPage(driver);
		l.username().sendKeys(username);
		l.Password().sendKeys(Passwd);
		System.out.println(text);
		
		driver.close();
	}
		
	@DataProvider
	public Object[][] getdata() {
Object[][] data= {
		{"khushbu","12345","hi"},
	{"yogesh","789456","bye"},
		
};
return data;
}
	}
