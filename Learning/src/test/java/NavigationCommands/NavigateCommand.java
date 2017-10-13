package NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommand {
	
	public static void main(String[]args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		// Open ToolsQA web site
		String appUrl = "https://www.google.com/gmail/about/";
		driver.get(appUrl);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
		
		Thread.sleep(3000);
		
		// Go back to Home Page
		driver.navigate().back();
		
		Thread.sleep(3000); 
		
	   // Go forward to Registration page
		driver.navigate().forward();
		
		Thread.sleep(3000); 
		
		// Refresh browser
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
