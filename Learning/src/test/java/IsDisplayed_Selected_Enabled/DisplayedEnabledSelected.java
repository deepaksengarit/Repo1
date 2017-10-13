package IsDisplayed_Selected_Enabled;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DisplayedEnabledSelected {

	@Test
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\2016\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/"); // enter URL

		// 1. isDisplayed() method: applicable of all elements
		
		boolean b1 = driver.findElement(By.cssSelector("#submitButton")).isDisplayed();

		System.out.println("Submit button is display :" + b1); //true
		
		// 2. isEnabled() method:
		
	   boolean b2 =	driver.findElement(By.cssSelector("#submitButton")).isEnabled();
	   System.out.println("Submit button is Enabled :"+b2); //false
	   
	   // Select I agree check box
	   
	   driver.findElement(By.name("agreeTerms")).click();
	   
	   boolean b3 = driver.findElement(By.cssSelector("#submitButton")).isEnabled();
	   System.out.println("Submit button is Enabled :"+b3); //true
	   
	   // 3. isSelected() method: only applicable for checkbox , dropdown , radiobutton
       boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
       System.out.println("Agree term checkbox is selected :"+b4); //true
       
       // deselect the checkbox
       driver.findElement(By.name("agreeTerms")).click();
       boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
       System.out.println("Agree term checkbox is selected :"+b5); //false

	}

}
