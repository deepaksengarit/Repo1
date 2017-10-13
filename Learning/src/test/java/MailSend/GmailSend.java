package MailSend;

import java.util.concurrent.TimeUnit;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailSend {
WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
        System.out.println("=======================Browser Started==================");
	}
	
	@Test(priority=1)
	public void gmailLogin() throws InterruptedException
	{
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("rbnsngh27@gmail.com");
		driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("deepak123@");
		driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
		Thread.sleep(7000);
		System.out.println("========================Application Loaded==================");
		
	}
	@Test(priority=2)
	public void composeMail() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id=':if']/div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id=':om']")).sendKeys("Test123@gmail.com");
		Thread.sleep(3000);
	}
	
	
	@AfterClass(alwaysRun=true)
	public void closeApp()
	{
		driver.quit();
		System.out.println("============================Browser Closed=======================");
	}
	
	
	

}

