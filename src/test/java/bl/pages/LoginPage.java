package bl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="UserID")
	public WebElement userId;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(name="btnLogin")
	public WebElement login;
	
	@FindBy(name="btnCreateAccount")
	public WebElement createAccount;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public DashboardPage doLogin(String userId, String password)
	{
		this.userId.clear();
		this.userId.sendKeys(userId);
		this.password.clear();
		this.password.sendKeys(password);
		login.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}

}
