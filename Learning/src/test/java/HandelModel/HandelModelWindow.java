package HandelModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelModelWindow {
	
	public static void main(String[]args){
		
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://goibibo.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='get_sign_up']")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("12345");
		
		System.out.println("Success");
		
	}

}
