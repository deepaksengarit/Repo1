package com.testcases;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class RocheLogout extends TestCore{


//User selects preferable language
	@Test
	public void test_Logout() throws Exception{
		
		
		
		try{
			
			
			//Click on profile
			driver.findElement(By.xpath(object.getProperty("R_profile"))).click();
			 //click on logout
			driver.findElement(By.xpath(object.getProperty("R_logout"))).click();
			
			/*// Click on alert button
			driver.findElement(By.id("popup_ok")).click();
			//Click on Logout button.

			driver.findElement(By.xpath("/html/body/div[3]/div/section/div/li/button")).click();
*/
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.accept();

			  
			   Thread.sleep(3000);
			//   Utility.writeResult("Ppass",76,5);
			Utility.getscreenshot("Logout",driver);				 
			Log.info("logout Page");
			Reporter.log("logout Page");
			
		}catch(Exception e){
			 // Utility.writeResult("PFail",76,5);
			Log.info("Unable to logout");
			Reporter.log("Unable to logout");
			throw new Exception();
		}
	}
		

	
	}

	


