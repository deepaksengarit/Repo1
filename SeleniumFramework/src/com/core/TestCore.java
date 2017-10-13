package com.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.utility.Utility;


/*
 * init() methods will be responsible for Initializing the Selenium server, Load properties, logs 
 * and other files
 * 
 */


public class TestCore {

	public static WebDriver driver;
	//public static int rowNo=0;
	public static List <WebElement> li;
	//public static String frameID;
	private boolean acceptNextAlert = true;
	//2nd step
	public static Properties config = new Properties();

	//3rd step
	public static Properties object = new Properties();
	
	//Constructor
	public TestCore(){
		DOMConfigurator.configure("log4j.xml");
	}


	//Get Driver
	public static WebDriver getDriver() {
		return driver;
	}

	//Set Driver
	public static void setDriver(String s) {
		Log.info("New driver instantiated");
		Reporter.log("New driver instantiated");
		switch(s){
		case "chrome": TestCore.driver = new ChromeDriver();
		break;
		default : TestCore.driver = new ChromeDriver();
		}

	}

	//Get Config
	public static Properties getConfig() throws IOException {
			
		return config;
	}

	//Set Config
	public static void setConfig(String s) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+s);
		TestCore.config.load(fis);

	}

	//Get Object
	public static Properties getObject() {
		return object;
	}

	//Set Object
	public static void setObject(String s) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+s);
		TestCore.object.load(fis);

	}

	@BeforeSuite	
	public static void init() throws Exception{

		//Setting properties file
		setConfig("//src//OR//config.properties");
		setObject("//src//OR//objects.properties");
		
		//Writing Test case name in log
		Log.startTestCase(config.getProperty("SuiteName"));
		
		Log.info("Loading config properties file");
		Reporter.log("Loading config properties file");
		
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		// WebDriver driver=new ChromeDriver();
		//New driver instantiated
		setDriver("chrome"); 
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		Utility.implicitWait(10, driver);
		
		//Launch website
		Log.info("Launching Browser");
		Log.info("Opening URL");
		
		Reporter.log("Launching Browser");
		Reporter.log("Opening URL");
		driver.get(config.getProperty("testsite"));
		
		//Maximize the browser
		Log.info("Maximizing Browser");
		Reporter.log("Maximizing Browser");
		
		driver.manage().window().maximize();
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

	}
	
	


	@AfterSuite
	public void suitClose(){
		Log.info("Closing the Browser");
		Reporter.log("Closing the Browser");
		driver.quit();
		//driver.close();
		Log.endTestCase(config.getProperty("SuiteName"));
	}

	//Is Element Present

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	//Is Alert Present
	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}


	//Close Alert Window
	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
	
public void elementExist(String s1,int rowNo) throws Exception {
		
	
		//Check Dropdown present or not
		if(isElementPresent(By.id(object.getProperty(s1)))){
			Log.info("Element present");
			Reporter.log("Element present");
			//Utility.writeResult("Pass",rowNo);
		}else{
			Log.info("Element not present");
			Reporter.log("Element not present");
			//Utility.writeResult("Fail",rowNo);
			throw new Exception();
		}
		
	}


}
