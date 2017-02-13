package tests.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver = null;
	
	@BeforeSuite(groups={"ui","mcLogin","twitLogin","login","high"})
	public static void init()
	{
		if(driver == null)
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		}
		
	}
	
	@AfterSuite(groups={"ui","mcLogin","twitLogin","login","high"})
	public static void quitDriver() 
	{
		driver.quit();
	}
}
