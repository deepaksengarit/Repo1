package Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.steadystate.css.dom.Property;
import com.utility.Utility;

public class LogDemo {
	
	public static void main(String[]args)
	{
		Logger logger=Logger.getLogger("LogDemo");
		
	    PropertyConfigurator.configure(System.getProperty("user.dir")+ "//src//test//java//Log//" + "log4j.properties");
		 
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		driver=new FirefoxDriver();
		logger.info("Firefox opened");  
       
		driver.manage().window().maximize();
		
		logger.info("Window maxmize");
	
		driver.get("http://www.google.com");
		     
		logger.info("URL entered");
		driver.quit();
	}

}
