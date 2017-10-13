package DatePicker;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerAdvance {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.xpath(".//*[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[3]")).click();
		Thread.sleep(3000);
		
		List<WebElement> dates=(List<WebElement>) driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		
		int total_node=dates.size();
		
		for(int i=0;i<total_node;i++)
		{
			String date=dates.get(i).getText();
			
			if(date.equalsIgnoreCase("31"))
			{
				dates.get(i).click();
				break;
			}
			System.out.println("success");
		}

	}

}
