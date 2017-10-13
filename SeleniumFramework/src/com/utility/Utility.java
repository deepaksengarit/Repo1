package com.utility;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


//import com.utility.ExcelUtils;


public class Utility  {


		
		//Implicit Wait
		
		public static void implicitWait(long seconds ,WebDriver driver){
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
		
		public static void getscreenshot(String filename,WebDriver driver) throws Exception 
	    {
			
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         //The below method will save the screen shot
	            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//src//com//screenshot//"+filename+".jpg"));
	    }
		public static void writeResult(String status, int RowNum, int ColNum) throws Exception{
            
            ReadExcelData.setExcelFile(System.getProperty("user.dir")+"//src//com//data//TestData.xlsx", "Sheet1");
            ReadExcelData.setCellData(status, RowNum, ColNum);
            //user.dir = It will take to the project. 
     }

				
		
	}
