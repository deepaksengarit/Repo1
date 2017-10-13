package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[3]")).click();
		Thread.sleep(3000);

	}

}
