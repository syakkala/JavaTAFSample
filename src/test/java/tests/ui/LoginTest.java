package tests.ui;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

import bl.pages.DashboardPage;
import bl.pages.LoginPage;
import core.TestDriver;

public class LoginTest {
	
	@BeforeTest
	public void openBrowserAndNavigate()
	{
		TestDriver.openBrowser("chrome");
		LoginPage.navigate();
	}
	
	@Test(priority=3, groups={"high"})
	public void login()
	{
		LoginPage.login("02052017@mcafee.com", "Poiu0987");
		Assert.assertEquals("My Account",DashboardPage.title());
		//System.out.println("Login1");
		//Assert.fail();
	}
	
	@Test(priority=1, dependsOnMethods={"login3"},alwaysRun=true)
	public void login2()
	{
		System.out.println("Login2");
	}
	
	@Test(priority=2, groups={"low"})
	public void login3()
	{
		System.out.println("Login3");
	}
	
	@AfterTest
	public void quit()
	{
		TestDriver.quit();
	}
	
}
