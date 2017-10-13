package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class irctc {
   
        WebDriver driver;
       
        @BeforeTest
        public void driverInitialize()
        {
            System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
            driver =new FirefoxDriver();
        }
       
        @Test(priority=1)
        public void testMethod() throws InterruptedException
        {
            System.out.println("Hello World!!!!!!");
            driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }
        @Test(priority=2)
        public void Login() throws InterruptedException{
            System.out.println("login");
            driver.findElement(By.xpath(".//*[@id='usernameId']")).sendKeys("djsengar");
            driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("singh@123");
            Thread.sleep(8000);
            driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
            Thread.sleep(9000);
            driver.findElement(By.xpath(".//*[@id='jpform:fromStation']")).sendKeys("NEW DELHI - NDLS");
            driver.findElement(By.xpath(".//*[@id='jpform:toStation']")).sendKeys("ETAWAH - ETW");
            driver.findElement(By.xpath(".//*[@id='jpform:journeyDateInputDate']")).sendKeys("10-07-2017");
            driver.findElement(By.xpath(".//*[@id='jpform:jpsubmit']")).click();
            Thread.sleep(6000);
            //train seat select
            driver.findElement(By.xpath(".//*[@id='cllink-12420-CC-2']")).click();
            Thread.sleep(7000);
            //Click BookNow for ticket booking
            driver.findElement(By.xpath("(//a[contains(text(),'Book Now')])[6]")).click();
           
            Thread.sleep(9000);
            driver.findElement(By.xpath(".//*[@class='input-style1 psgn-name']")).sendKeys("Deepak");
            driver.findElement(By.xpath(".//*[@class='input-style1 psgn-age only-numeric']")).sendKeys("27");
           
            Select gender=new Select(driver.findElement(By.xpath(".//*[@class='input-style1 psgn-gender']")));
            gender.selectByVisibleText("Male");
           
        //    WebElement berth=driver.findElement(By.xpath(".//*[@class='input-style1 psgn-berth-choice']"));
        //    Select berthP=new Select(berth);
            //berthP.selectByVisibleText("Male");
            //Select berth=new Select(driver.findElement(By.xpath(".//*[@class='input-style1 psgn-berth-choice']")));
        //    berth.selectByVisibleText("WINDOW SIDE");
            Thread.sleep(10000);
            driver.findElement(By.xpath(".//*[@id='validate']")).click();
           
            Thread.sleep(9000);
        }

        @AfterTest
        public void teardown(){
            driver.quit();
        }

}