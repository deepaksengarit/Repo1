package VerifyError;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyErrorMessage2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://accounts.google.com");
		
		 
		 driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		 
		 String actual_error=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		 
		 String expected_error="Enter an email or phone number";
		 
		 Assert.assertEquals(actual_error,expected_error);
		 Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
		 
		 System.out.println("Test Completed");

	}

}
