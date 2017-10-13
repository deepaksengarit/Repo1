package RightClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\2016\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Initialize WebDriver
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Wait for page load
																		

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		WebElement R1 = driver.findElement(By
				.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]"));

		// Initialize Actions class object
		Actions builder = new Actions(driver);

		// Perform Right Click on MEN and Open "Men" content in a new tab

		Thread.sleep(5000);
		builder.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();

		Thread.sleep(4000);
		// closing current driver window
		driver.close();

	}

}
