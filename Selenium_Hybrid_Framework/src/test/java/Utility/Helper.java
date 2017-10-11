package Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Helper 
{
	public static String captureScreenshot(WebDriver driver, String screenShotName)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println("user.dir " + System.getProperty("user.dir"));
		
		//String destination = System.getProperty("user.dir")+"\\ScreenShots\\"+screenShotName+System.currentTimeMillis()+ ".png";
		String destination = "D:\\Java_Projects\\Selenium_Hybrid_Framework\\ScreenShots\\"+screenShotName+System.currentTimeMillis()+ ".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) 
		{
			System.out.println("Failed to capture screenshot "+ e.getMessage());
		}
		return destination;
		
	}
	
	/* Function to split the String and then convert the String value to int */
	
	public static List<String> convertStringToInteger(String text, String delimiter)
	{
		List<String> list = new ArrayList<String>();
		int start = 0, end = 0;
		for (int i = text.indexOf(delimiter); i != -1; i = text.indexOf(delimiter, i+1)) 
		{
			end = i;
			list.add(text.substring(start, end));
			start = i;
		}
		list.add(text.substring(end));
		return list;		
}
	
	public static String[] splitMethod(String text, String delimiter)
	{
		String[] shipingMethod = text.split(delimiter);
		return shipingMethod;
	}
	
	public static int convertStringToInt(String text)
	{
		return Integer.parseInt(text);
	}
}
