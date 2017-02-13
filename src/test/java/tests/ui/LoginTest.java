package tests.ui;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bl.pages.DashboardPage;
import bl.pages.LoginPage;

public class LoginTest extends TestBase {
	
	@BeforeTest
	public void openBrowser()
	{
		driver.get("https://home.mcafee.com/secure/protected/login.aspx");
	}

	@Test(groups={"ui","mcLogin","login","high"})
	public void mcLogin()
	{
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		DashboardPage dp = lp.doLogin("tafsample@mcafee.com", "Poiu0987");
		Assert.assertEquals("My Account",dp.getTitle());
		dp.doLogOut();
	}
}
