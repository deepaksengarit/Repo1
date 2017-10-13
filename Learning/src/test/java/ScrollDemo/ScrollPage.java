package ScrollDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollPage {

 public static void main(String[] args) throws Exception {
  
	 System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 

 // maximize browser
  driver.manage().window().maximize();
 

  // Open Application
  driver.get("http://jqueryui.com");
  

  // Wait for 5 second
  Thread.sleep(5000);

 // This  will scroll page 400 pixel vertical
  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
  
     
 }

}
