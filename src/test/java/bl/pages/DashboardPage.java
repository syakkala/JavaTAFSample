package bl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.TestDriver;

public class DashboardPage {
	
	@FindBy(xpath="//*[@id='bdy']/h1")
	public WebElement accountTitle;
	
	@FindBy(xpath="//*[@id='ctl00_m_HeaderFullNavigation_ucDashBoardPersonalNav_m_accountDropdown']/span/ul/li[5]/a")
	public WebElement updateProfileLink;
	
	@FindBy(xpath="//*[@id=\"ctl00_m_HeaderFullNavigation_ucDashBoardPersonalNav_PersonalNavigation\"]/li[3]/a")
	public WebElement logOut;
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitle()
	{
		return accountTitle.getText();
	}
	
	public void doLogOut()
	{
		logOut.click();
	}
}
