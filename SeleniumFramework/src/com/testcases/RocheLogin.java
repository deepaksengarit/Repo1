package com.testcases;


import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;

import com.utility.Constant;
import com.utility.ReadExcelData;
import com.utility.Utility;


public class RocheLogin extends TestCore{


//User selects preferable language
	@Test(priority=1)
	public void test_Login() throws Exception{
		Log.info("Testing Login Page");
		Reporter.log("Testing Login Page");

		
		
		try{
		   
			//Entering the UserName
			driver.findElement(By.xpath(object.getProperty("R_usname"))).sendKeys("apptestt4");
			 
			 //Entering Password
			driver.findElement(By.xpath(object.getProperty("R_pswd"))).sendKeys("1234567");
		     // ReadExcelData.setCellData("Pass", 1, 2);
			//SignIn
			driver.findElement(By.xpath(object.getProperty("R_signIn"))).click();
			
			   Thread.sleep(180000);

				//System.out.println("Get excel");
			
				Utility.getscreenshot("SignIN",driver);				 
				Log.info("SignIN Login Page");
				Reporter.log("SignIN Login Page");

				
				}catch(Exception e){

					
					//System.out.println("Run this if excepttion occurs");
					 //Utility.writeResult("Fail",3,5);
					Utility.getscreenshot("SignIN",driver);				 
					Log.info("Not SignIN");
					Reporter.log("Not SignIN");
					throw new Exception();


					
					
					
				}
			
			
			
		}
	}
		

	
	

	


