package com.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void getscreenshot(String filename,WebDriver driver) throws Exception 
    {
		
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
            //The below method will save the screen shot
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//src//test/java//com//screenshot//"+filename+".jpg"));
            
            System.out.println("Screenshot Taken");
    }
}
