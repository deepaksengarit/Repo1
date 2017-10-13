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

public class TestScript {
	
	WebDriver driver;
	
	@BeforeTest
	public  void login() {
		
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
        driver =new FirefoxDriver();
		}
	@Test(priority=1)
	public void URLGet(){
	  
	  driver.get("https://demo.virtuemart.net/");
	  driver.manage().window().maximize();
	  
     }
	
	@Test(priority=2)
	public void PageScroll() throws Exception{
		
				
		 ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		 Thread.sleep(5000);
		 
		//Cookie handle click on Understand button
			driver.findElement(By.cssSelector(".accept")).click();
		 System.out.println("Scrolled");
	}

	@Test(priority=4)
	public void firstPagination() throws Exception{
		
		List<WebElement> listelements1 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(1)>.spacer.product-container>div>div>form>div>div:nth-child(1)>div>div>div>div>ul>li"));
        for(WebElement item:listelements1) 
       { 
       
            System.out.println("Dress Shirt with tie Dropdown values are "+ item.getText());
            Thread.sleep(2000);
        }
		
		List<WebElement> listelements2 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
    for(WebElement item:listelements2) 
   { 
   
        System.out.println("T-Shirt classic blue Dropdown values are "+ item.getText());
        Thread.sleep(2000);
    }
	
  
	
		List<WebElement> listelements3 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(3)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
	    for(WebElement item:listelements3) 
	   { 
	   
	        System.out.println("Zipperpullover Dropdown values are "+ item.getText());
	        Thread.sleep(2000);
	    }
	}
	@Test(priority=5)
	public void scrollUp() throws Exception{
		 ((JavascriptExecutor)driver).executeScript("scroll(0,-2000)");
		 Thread.sleep(5000);
		 System.out.println("Scrolled Up");
		 
		 //Click on 2nd navigation Button
		 
		 driver.findElement(By.xpath(".//*[@id='main']/div[2]/div[4]/div[2]/div[2]/ul/li[4]/a")).click();
		 Thread.sleep(3000);
		 
		 System.out.println("click on 2nd pagination tab");
	}
	
	@Test(priority=6)
	public void secondPagination() throws Exception{
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		 Thread.sleep(3000);
		
		 System.out.println("Scrolled");
			List<WebElement> listelements1 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(1)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
		    for(WebElement item:listelements1) 
		   { 
		   
		        System.out.println("Quantity related price calculation values are "+ item.getText());
		        Thread.sleep(2000);
		    }
			List<WebElement> listelements2 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
		    for(WebElement item:listelements2) 
		   { 
		   
		        System.out.println("Coat Quantity related price calculation values are "+ item.getText());
		        Thread.sleep(2000);
		    }
			List<WebElement> listelements3 = driver.findElements(By.cssSelector(".products-view>div:nth-child(2)>div:nth-child(3)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
		    for(WebElement item:listelements3) 
		   { 
		   
		        System.out.println("T-shirt Quantity related price calculation values are "+ item.getText());
		        Thread.sleep(2000);
		    }
		 
	}
	@Test(priority=7)
	public void thirdPagination() throws Exception{
		 ((JavascriptExecutor)driver).executeScript("scroll(0,-2000)");
		 Thread.sleep(5000);
		 System.out.println("Scrolled Up");
		 
		 //Click on 2nd navigation Button
		 
		 driver.findElement(By.xpath(".//*[@id='main']/div[2]/div[4]/div[2]/div[2]/ul/li[5]/a")).click();
		 Thread.sleep(3000);
		 
		 System.out.println("click on 3rd pagination tab");
		 
			List<WebElement> listelements1 = driver.findElements(By.cssSelector(".products-view>div:nth-child(8)>div:nth-child(3)>div:nth-child(1)>div:nth-child(5)>div>form>div>div>div>div>div>div>ul>li"));
		    for(WebElement item:listelements1) 
		   { 
		   
		        System.out.println("Third Tab calculation values are "+ item.getText());
		        Thread.sleep(2000);
		    }
	
	}
	
	@AfterTest
	public void teardown(){
		
	 driver.quit();
	}
}
