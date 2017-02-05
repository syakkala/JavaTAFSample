package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestDriver {
	
	private static WebDriver driver;
	
	public static void openBrowser(String browser)
    {
		driver = new ChromeDriver();
		
        /*switch (browser.toLowerCase())
        {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }*/
    }
	
	public static void navigateToUrl(String url)
    {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
	
	public static WebElement findElementById(String id)
    {
        return driver.findElement(By.id(id));
    }

	public static WebElement findElementByName(String name)
    {
        return driver.findElement(By.name(name));
    }
	
	public static WebElement findElementByClassName(String className)
    {
        return driver.findElement(By.className(className));
    }

    public static void click(WebElement element)
    {
        element.click();
    }
    
    public static void enterText(WebElement element, String text)
    {
        element.clear();
        element.sendKeys(text);
    }
    
    public static String title()
    {
    	return driver.getTitle();
    }

    public static void quit()
    {
        driver.quit();
    }
}
