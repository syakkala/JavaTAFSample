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
		TestDriver.openBrowser("chrome");
		DashboardPage.navigate();
	}
	
	@Test
	public void dashboard()
	{
		LoginPage.login("subbarao_yakkala@mcafee.com", "asdf1234");
		Assert.assertEquals("My Account",DashboardPage.title());
	}
	
	@AfterTest
	public void quit()
	{
		TestDriver.quit();
	}
	
}
