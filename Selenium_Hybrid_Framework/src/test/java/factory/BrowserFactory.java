package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Data_Provider.ConfigDataProvider;

public class BrowserFactory 
{
	public static WebDriver driver;
	static ConfigDataProvider confDataPro;
	
	public static WebDriver getDriver(String browserType)
	{
		if (browserType.equalsIgnoreCase("firefox")) 
		{
			 System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("chrome")) 
		{
			confDataPro = ReturnObjectsDataProvider.returnConfigObject();
			System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\STUDY MATERIAL\\ChromeDriverexe\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("IE")) 
		{
			confDataPro = ReturnObjectsDataProvider.returnConfigObject();
			System.setProperty("webdriver.ie.driver", confDataPro.getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void tearDown()
	{
		driver.close();
	}
}
