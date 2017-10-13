

	package com.testcases;


	import org.openqa.selenium.By;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	import com.core.Log;
	import com.core.TestCore;
import com.utility.Utility;


	public class News extends TestCore{


	//User selects preferable language
		@Test(priority=1)
		public void test_News() throws Exception{
			Log.info("News Page");
			Reporter.log("News Page");

			
			
			try{
				
				
							
				//Click on News
				driver.findElement(By.cssSelector("body > div.ng-view.main_frame.ng-scope > div.container.ng-scope > section > form > div > nav > ul > li:nth-child(6) > a")).click();
							
				Thread.sleep(3000);
				//click on menu button
				
				driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
				Thread.sleep(2000);
				Utility.getscreenshot("News",driver);				 
				Log.info("News click");
				Reporter.log("News click");
				
			}catch(Exception e){
				
				Log.info("News not click");
				Reporter.log("News not click");
				throw new Exception();
			}
		}
			

	}

