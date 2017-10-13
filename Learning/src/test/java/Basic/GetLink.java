
package Basic;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetLink {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
        System.out.println("=======================Browser Started==================");
	}
	
	@Test
	public void Login() throws Exception
	{
		driver.get("http://127.0.0.1:8000/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#email")).sendKeys("deepak.kumar@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Asdf@1234");
		driver.findElement(By.cssSelector(".btn.btn-success.btn-sign-in")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.cssSelector(".sidebar-menu>li>a"));
        for (WebElement element : list) {
            String link = element.getAttribute("href");
            System.out.println(element.getTagName() + "=" + link +", "+ element.getText());
        }
	}
		
		
	
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		System.out.println("============================Browser Closed=======================");
	}

}