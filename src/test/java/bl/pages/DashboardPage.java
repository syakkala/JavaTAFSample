package bl.pages;

import org.openqa.selenium.WebElement;

import core.TestDriver;

public class DashboardPage {
	
	private static WebElement dashBoardTitle()
	{
		return TestDriver.findElementByClassName("dashB");
	}

	public static String title()
	{
		return DashboardPage.dashBoardTitle().getText();
	}
	
	public static void navigate()
    {
        TestDriver.navigateToUrl("https://home.mcafee.com/Secure/MyAccount/DashBoard.aspx");
    }
}
