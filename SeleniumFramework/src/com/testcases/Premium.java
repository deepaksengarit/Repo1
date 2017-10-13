
package com.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class Premium extends TestCore{


//User selects preferable language
	@Test(enabled=false)
	public void test_News() throws Exception{
		Log.info("Premium Page");
		Reporter.log("Premium Page");

		
		
		try{
			
	
			
						
			//Click on Premium
 			driver.findElement(By.className("premium")).click();
 				
  			Thread.sleep(7000);
  			
  			
  			//(JavascriptExecutor(WebDriver)).executeScript("document.getElementsByClassName('post-tag')[0].click();");
  			JavascriptExecutor js = (JavascriptExecutor)driver;
  			Object element = driver.findElement(By.xpath("//*[@id='checkbox_21']"));
			js.executeScript("arguments[0].click();", element);
  	
  			Thread.sleep(2000);
  			//click on Jetz button
     		driver.findElement(By.cssSelector("body > div.ng-view.main_frame.ng-scope > div.premium_bg_new.ng-scope > div.container > section > div.premium_div > div.btm_add_cart_main > div > button")).click();
  			Thread.sleep(2000);
  			System.out.println("Premium");
  			//click on Sterne button
  			driver.findElement(By.cssSelector("body > div.ng-view.main_frame.ng-scope > div.premium_bg_new.ng-scope > div > section > div.premium_first_lg_image > div > p > input")).click();
  			Thread.sleep(10000);
  			// click on alert
  			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/p/input")).click();
  			System.out.println("clicked on alert");
  			Thread.sleep(2000);
  			// Click on hauptmenu
  			driver.findElement(By.xpath("/html/body/div[3]/div/section/div[5]/p/input")).click();
  			System.out.println("clicked on hauptment");
 			//click on menu button
  			Thread.sleep(2000);
  		
			Utility.getscreenshot("Premium",driver);				 
			Log.info("Premium click");
			Reporter.log("v click");

		}catch(Exception e){
			
			Log.info("Premium not click");
			Reporter.log("Premium not click");
			throw new Exception();
		}
	}
		

}

