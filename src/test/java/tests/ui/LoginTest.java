package tests.ui;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bl.pages.DashboardPage;
import bl.pages.LoginPage;

public class LoginTest {
	
	@Test
	public void mcLogin() throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.get("https://home.mcafee.com/secure/protected/login.aspx");
		driver.findElement(By.name("UserID")).sendKeys("tafsample@mcafee.com");
		driver.findElement(By.name("Password")).sendKeys("Poiu0987");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000L);
		driver.quit();
	}
}
