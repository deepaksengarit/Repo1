package GetScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;

import com.utility.Utility;

public class screenshotGoogle extends Utility {

 
@Test
public void TestJavaS1() throws Exception{
 
WebDriver driver;

System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
driver=new FirefoxDriver();
 

 Utility.getscreenshot("Browser",driver);	
 

driver.manage().window().maximize();

Utility.getscreenshot("Window",driver);	

driver.get("http://www.google.com");
     
Utility.getscreenshot("google",driver);	

driver.quit();
 
  }


 
}