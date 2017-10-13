package DataDriven;

import java.util.concurrent.TimeUnit;

import lib.ExcelDataConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
        System.out.println("=======================Browser Started==================");
	}
	
	@Test(priority=1)
	public void startApp() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("https://www.facebook.com/"));
		Thread.sleep(2000);
		System.out.println("========================Application Loaded==================");
		
	}
	
	@Test(priority=2,dataProvider="FacebookData")
	public void loginApp(String Username,String Password) throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Password);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		Thread.sleep(2000);
		System.out.println("=================Login Successfully==========================");
	}
	@Test(priority=3)
    public void logoutApp() throws InterruptedException
    {
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.name("Log Out")).click();
		driver.findElement(By.partialLinkText("Log Out")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='email']")).isDisplayed());
		System.out.println("Logout Done");
    }
	
	@AfterClass(alwaysRun=true)
	public void closeApp()
	{
		driver.quit();
		System.out.println("============================Browser Closed=======================");
	}
	
	@DataProvider(name="FacebookData")
	public Object[][] passData()
	{
		
		ExcelDataConfig config=new ExcelDataConfig("D:\\Play_Framework\\Learning\\src\\test\\java\\TestData\\InputData.xlsx");
		
		int rows=config.getRowCount(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
		}
		
	
		
		return data;
		
		
	}

}
