package bl.pages;

import org.openqa.selenium.WebElement;

import bl.model.Login;
import core.TestDriver;

public class LoginPage {
	
	public static WebElement userIDText()
	{
		return TestDriver.findElementById("UserID");
	}
	
	public static WebElement passwordText()
	{
		return TestDriver.findElementById("Password");
	}
	
	public static WebElement loginButton()
	{
		return TestDriver.findElementByName("btnLogin");
	}
	
	public static WebElement registerNowButton()
	{
		return TestDriver.findElementByName("btnCreateAccount");
	}
	
	public static void navigate()
    {
        TestDriver.navigateToUrl("https://home.mcafee.com/secure/protected/login.aspx");
    }
	
	private static void fillForm(Login loginInfo)
    {
        TestDriver.enterText(LoginPage.userIDText(), loginInfo.email);
        TestDriver.enterText(LoginPage.passwordText(), loginInfo.password);
    }
	
	private static void submitForm()
    {
        TestDriver.click(LoginPage.loginButton());
    }

    public static void login(String email, String password)
    {
        Login loginInfo = new Login();
        loginInfo.email = email;
        loginInfo.password = password;
        fillForm(loginInfo);
        submitForm();
    }

    public static void clickRegisterNowButton()
    {
        TestDriver.click(LoginPage.registerNowButton());
    }

}
