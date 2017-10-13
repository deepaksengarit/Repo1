package FileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	WebDriver driver;
	
	@Test
	public void fileUpload() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:Users/Deepak/Desktop/fileupload.html");
		
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\Fileupload.exe");
		
	}

}
