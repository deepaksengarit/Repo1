package com.testcases;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class Score extends TestCore{


//User selects preferable language
    @Test(priority=1)
    public void test_Score() throws Exception{
          Log.info("Score Page");
          Reporter.log("Score Page");

          
          
          try{
                 
                 
                                     
                 //Click on Statistik
                 driver.findElement(By.className("ranking")).click();
                                     
                 Thread.sleep(60000);
                 
                 Utility.getscreenshot("Score",driver);                      
                 Log.info("Score click");
                 Reporter.log("Score click");
                 
          }catch(Exception e){
                 
                 Log.info("Score not click");
                 Reporter.log("Score not click");
                 throw new Exception();
          }
    }
          


    
@Test(priority=2)
public void test_Statistik () throws Exception{
    Log.info("Statistik  Page");
    Reporter.log("Statistik  Page");

    
    
    try{
          
          
                              
          //Click on Statistik
          driver.findElement(By.cssSelector("body > div.ng-view.main_frame.ng-scope > div.score_bg.ng-scope > div > section > form > div > div > div > ul > li:nth-child(1) > a")).click();
          
          Thread.sleep(2000);
                              
                        
          //click on prevoius button
           driver.findElement(By.xpath("//*[@id='common_header']/div[2]/div[1]/img")).click();
          Thread.sleep(60000);
          
          
          /*//click on menu button
          
          driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
          Thread.sleep(2000);*/
          
          Utility.getscreenshot("Statistik ",driver);                        
          Log.info("Statistik  click");
          Reporter.log("Statistik  click");
          
    }catch(Exception e){
          
          Log.info("Statistik  not click");
          Reporter.log("Statistik  not click");
          throw new Exception();
    }
}
    

@Test(priority=3)
public void test_Rangliste () throws Exception{
    Log.info("Rangliste  Page");
    Reporter.log("Rangliste Page");

    
    
    try{
          
          
                              
          //Click on Rangliste
          driver.findElement(By.cssSelector("body > div.ng-view.main_frame.ng-scope > div > div > section > form > div > div > div > ul > li:nth-child(2) > a")).click();
                              
          Thread.sleep(4000);
          
          /*//click on app rank
           driver.findElement(By.xpath("/html/body/div[3]/div/div/section/form/div/div/div/ul/li[77]/a")).click();
          Thread.sleep(2000);*/
          //click on prevoius button
          // driver.findElement(By.xpath("//*[@id='common_header']/div[2]/div[1]/img")).click();
          //Thread.sleep(4000); 
          
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

