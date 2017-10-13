package GetScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utility.Utility;

public class FailedTestScreenshot {
	
	WebDriver driver;
	
	@Test
	public void captureScreenshot()
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']1")).sendKeys("test@gmail.com");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception
	{
		if (ITestResult.FAILURE == result.getStatus())
		 {
			System.out.println("result value is "+ result.getStatus());
			
				Utility.getscreenshot(result.getName(), driver);
	
			}
				driver.quit();	
		    }}
