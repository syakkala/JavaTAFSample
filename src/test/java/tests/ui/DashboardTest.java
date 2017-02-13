package tests.ui;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bl.pages.*;
import core.TestDriver;

public class DashboardTest {

	@BeforeTest
	public void openBrowserAndNavigate()
	{
		//TestDriver.openBrowser("chrome");
		//DashboardPage.navigate();
	}
	
	@Test(priority=1, groups={"low"})
	public void dashboard()
	{
		LoginPage.login("02052017@mcafee.com", "Poiu0987");
		Assert.assertEquals("My Account",DashboardPage.title());
		//System.out.println("dashboard");
	}
	
	@AfterTest
	public void quit()
	{
		//TestDriver.quit();
	}
	
}
