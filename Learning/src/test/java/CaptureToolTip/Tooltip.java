package CaptureToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.interactions.Actions;
 
import org.testng.Assert;

 
public class Tooltip {
	

 
 public static void main(String[] args) {
 
 // This will open browser
	 System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 
 // This will maximize your browser
driver.manage().window().maximize();
 
// Open Gmail account creation page
driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
 
// Click on username textbox
driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();

System.out.println("Click Username");
 
// Create action class object
Actions builder=new Actions(driver);
 
// find the tooltip/helptext message xpath
WebElement username_tooltip=driver.findElement(By.xpath(".//*[@id='bubble-5']"));
System.out.println("find Username");
// Mouse hover to that text
builder.moveToElement(username_tooltip).perform();
 
// Extract the text from tooltip using getText
String tooltip_msg=username_tooltip.getText();
 
 // Print the tooltip message
System.out.println("Tooltip message is "+tooltip_msg);
 
// This is expected message should come and store in variable
 String expected_tooltip="You can use letters, numbers, and periods.";
 
// It will compare if actual matches with expected then TC will fall else it will fail
 
Assert.assertEquals(tooltip_msg, expected_tooltip);
 
System.out.println("Message verifed");

driver.quit();
 
            }
 
}