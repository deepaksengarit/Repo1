package Basic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testnerds {
	
	WebDriver driver;
	
	@BeforeTest
	public  void login() {
		
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
		}
	@Test(priority=1)
	public void URLGet(){
	  
	  driver.get("https://testnerds.io");
	  driver.manage().window().maximize();
	  
     }
	
	
	
	@AfterTest
	public void teardown(){
		
	 driver.quit();
	}
}

