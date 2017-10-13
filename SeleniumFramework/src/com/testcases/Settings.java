package com.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class Settings extends TestCore{


//User selects preferable language
    @Test(priority=1)
    public void test_Settings() throws Exception{
          Log.info("Settings Page");
          Reporter.log("Settings Page");

          
          
          try{
                 
                 
                                     
                 //Click on Settings icon
                 driver.findElement(By.xpath("/html/body/div[3]/div[6]/li[2]/img")).click();
                                     
                 Thread.sleep(4000);
                 
                 Utility.getscreenshot("Setting click",driver);                      
                 Log.info("Setting click click");
                 Reporter.log("Setting click click");
                 
          }catch(Exception e){
                 
                 Log.info("Setting  not click");
                 Reporter.log("Setting not click");
                 throw new Exception();
          }
    }
          


    
@Test(priority=2)
public void test_Feedback () throws Exception{
    Log.info("Feedback  Page");
    Reporter.log("Feedback  Page");

    
    
    try{
          
          
                              
    	 //Click on feedback
        driver.findElement(By.linkText("Feedback/Kontakt")).click();
        
        Thread.sleep(2000);
                            
                      
        //click on text box
         driver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div[2]/div/nav/ul/li[2]/form/div/div[1]/textarea")).sendKeys("Hello oct27");
        Thread.sleep(2000);
        
        
        //click on Abschicken button
        JavascriptExecutor js = (JavascriptExecutor)driver;
		Object element = driver.findElement(By.xpath("//*[@id='green_new_button']"));
		js.executeScript("arguments[0].click();", element);
	
			Thread.sleep(4000);
          
          Utility.getscreenshot("Feedback ",driver);                        
          Log.info("Feedback  click");
          Reporter.log("Feedback  click");
          
    }catch(Exception e){
          
          Log.info("Feedback  not click");
          Reporter.log("Feedback  not click");
          throw new Exception();
    }
}
    

@Test(priority=3)
public void test_Support () throws Exception{
    Log.info("Support   Page");
    Reporter.log("Support Page");

    
    
    try{
          
          
                              
          //Click on Support 
          driver.findElement(By.linkText("Support")).click();
                              
          Thread.sleep(4000);
          
          //click on text box
           driver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div[2]/div/nav/ul/li[3]/form/div/div[1]/textarea")).sendKeys("Hello testing");
          Thread.sleep(2000);
        //click on Abschicken button
          JavascriptExecutor js = (JavascriptExecutor)driver;
  		Object element = driver.findElement(By.xpath("//*[@id='green_new_button']"));
  		js.executeScript("arguments[0].click();", element);
          Thread.sleep(4000); 
          
   //click on menu button
          
          driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
          Thread.sleep(2000);

		Utility.getscreenshot("Rangliste",driver);				 
		Log.info("Rangliste click");
		Reporter.log("Rangliste click");
		
	}catch(Exception e){
		
		Log.info("Rangliste not click");
		Reporter.log("Rangliste not click");
		throw new Exception();
	}
}

}

