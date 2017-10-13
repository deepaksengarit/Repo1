package Basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dependency {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
        System.out.println("=======================Browser Started==================");
	}
	
	@Test
	public void startApp()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("https://www.facebook.com/"));
		System.out.println("========================Application Loaded==================");
		
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rbnsngh27@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("singh@123");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		boolean status=driver.findElement(By.xpath(".//*[@id='navItem_100000998704105']/a/div")).isDisplayed();
		Assert.assertTrue(status);
		Thread.sleep(3000);
		System.out.println("=================Login Successfully==========================");
	}
	
	@Test(dependsOnMethods="loginApp")
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
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		System.out.println("============================Browser Closed=======================");
	}

}
