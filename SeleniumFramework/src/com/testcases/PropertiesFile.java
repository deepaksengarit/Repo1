package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class PropertiesFile extends TestCore {
  public static void main(String[] args) throws Exception  {
	  
	  
	  
   //Creating the File Object
   File file = new File("D:\\Developement\\WorkSpace\\SeleniumFramework\\src\\OR\\objects.properties");
   //Creating properties object
   Properties prop = new Properties();
  //Creating InputStream object to read data
   FileInputStream objInput = null;
   try {
    objInput = new FileInputStream(file);
    //Reading properties key/values in file
    prop.load(objInput);
    //Closing the InputStream
    objInput.close();
    } catch (FileNotFoundException e) {
     System.out.println(e.getMessage());   
     
    } catch (IOException e) {
   System.out.println(e.getMessage());
  }
   //Creating the driver instance
   WebDriver driver = new FirefoxDriver();
   //Adding wait
  Utility.implicitWait(2, driver);
   //maxmize the window
   driver.manage().window().maximize();
   //Launching the GMAIL page
   driver.get(prop.getProperty("Gmail.URL"));
  
   
   
   Utility.getscreenshot("url", driver);
  //Entering the UserName
   WebElement element = driver.findElement(By.id(prop.getProperty("Gmail.LoginPage.txtUserName")));
   element.sendKeys("umsatestapp@gmail.com");
   Utility.getscreenshot("username", driver);
   
   // click on next button
    driver.findElement(By.xpath(".//*[@id='next']")).click();
   //Entering the Password
   element = driver.findElement(By.id(prop.getProperty("Gmail.LoginPage.txtPassword")));
   element.sendKeys("123@singh");
   //Clicking the SignIn button
   element = driver.findElement(By.id(prop.getProperty("Gmail.LoginPage.btnSignIn")));
  
   element.click();
  
   
   
   Thread.sleep(3000);
   

   System.out.println("Test Scenario Completed!!");
   //Destroying the driver object
   driver.close();

  }
  
}