package ScrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FacebookScroll {

public static void main(String[] args) throws Exception {

	 System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();



driver.manage().window().maximize();





driver.get("https://www.flipkart.com/mens-clothing/tshirts/pr?sid=2oq,s9b,j9y&otracker=nmenu_sub_Men_0_T-Shirts");



//JavascriptExecutor je = (JavascriptExecutor) driver;




driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div[2]/div/div[1]/div/div/div[5]/section/div[2]/div[2]/span/span[3]")).click();
Thread.sleep(3000);


//WebElement element = driver.findElement(By.cssSelector("div[data-reactid='204']>section>div>div>div>div>div>div[title='Puma']>div>div"));
WebElement element = driver.findElement(By.cssSelector("div[data-reactid='204']>section>div>div>div>div>div>div[title='Fizzaro']>div>div"));


((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);






System.out.println(element.getText());
element.click();
Thread.sleep(3000);
driver.close();
driver.quit();
}

}