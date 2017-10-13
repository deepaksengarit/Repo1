package com.testcases;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.core.Log;
import com.core.TestCore;
import com.utility.Utility;


public class Badges extends TestCore{


//User selects preferable language
	@Test(priority=1)
	public void test_Badges() throws Exception{
		Log.info("Badges Page");
		Reporter.log("Badges Page");

		
		
		try{
			
			
						
			//Click on Badges
			driver.findElement(By.className(object.getProperty("Badges"))).click();
						
			Thread.sleep(2000);
			
			Utility.getscreenshot("Badges",driver);				 
			Log.info("Badges click");
			Reporter.log("Badges click");
			
		}catch(Exception e){
			
			Log.info("Badges not click");
			Reporter.log("Badges not click");
			throw new Exception();
		}
	}
		


	
@Test(priority=2)
public void test_kbBadges() throws Exception{
	Log.info("KbBadges Page");
	Reporter.log("KbBadges Page");

	
	
	try{
		
		
					
		//Click on KbBadges
		driver.findElement(By.cssSelector(object.getProperty("KbBadges"))).click();
					
		Thread.sleep(2000);
		
		//click on bullet
		driver.findElement(By.xpath(object.getProperty("Bullet"))).click();
		Thread.sleep(2000);
		//click on prevoius button
		driver.findElement(By.xpath(object.getProperty("Prev_Button"))).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		/*//click on menu button
		
		driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
		Thread.sleep(2000);*/
		
		Utility.getscreenshot("KbBadges",driver);				 
		Log.info("KbBadges click");
		Reporter.log("KbBadges click");
		
	}catch(Exception e){
		
		Log.info("KbBadges not click");
		Reporter.log("KbBadges not click");
		throw new Exception();
	}
}
	

@Test(priority=3)
public void test_QuizBadges() throws Exception{
	Log.info("QuizBadges Page");
	Reporter.log("QuizBadges Page");

	
	
	try{
		
		
					
		//Click on QuizBadges
		driver.findElement(By.cssSelector(object.getProperty("QuizBadges"))).click();
					
		Thread.sleep(2000);
		
		//click on bullet
		driver.findElement(By.xpath(object.getProperty("Q_Bullet"))).click();
		Thread.sleep(2000);
		//click on prevoius button
				driver.findElement(By.xpath(object.getProperty("Prev_Button"))).click();
				Thread.sleep(2000);	
		
		/*//click on menu button
		
		driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
		Thread.sleep(2000);*/
		
		Utility.getscreenshot("QuizBadges",driver);				 
		Log.info("QuizBadges click");
		Reporter.log("QuizBadges click");
		
	}catch(Exception e){
		
		Log.info("QuizBadges not click");
		Reporter.log("QuizBadges not click");
		throw new Exception();
		
	}
}
@Test(priority=4)
public void test_SonderBadges() throws Exception{
	Log.info("SonderBadges Page");
	Reporter.log("SonderBadges Page");

	
	
	try{
		
		
					
		//Click on SonderBadges
		driver.findElement(By.cssSelector(object.getProperty("SonderBadges"))).click();
					
		Thread.sleep(2000);
		
		//click on bullet
		driver.findElement(By.xpath(object.getProperty("S_Bullet"))).click();
		Thread.sleep(2000);
				
		//click on prevoius button
		driver.findElement(By.xpath(object.getProperty("Prev_Button"))).click();
		Thread.sleep(2000);	
		/*//click on menu button
		
		driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
		Thread.sleep(2000);
		*/
		Utility.getscreenshot("SonderBadges",driver);				 
		Log.info("SonderBadges click");
		Reporter.log("SonderBadges click");
		
	}catch(Exception e){
		
		Log.info("SonderBadges not click");
		Reporter.log("vBadges not click");
		throw new Exception();
	}
}

@Test(priority=5)
public void test_VersteckteBadges() throws Exception{
	Log.info("VersteckteBadges Page");
	Reporter.log("VersteckteBadges Page");

	
	
	try{
		
		
					
		//Click on VerBadges
		driver.findElement(By.cssSelector(object.getProperty("VerBadges"))).click();
					
		Thread.sleep(2000);
		
		//click on Vbullet
		driver.findElement(By.xpath(object.getProperty("V_Bullet"))).click();
		Thread.sleep(2000);
				System.out.println("Badges");
		
		//click on menu button
		
		driver.findElement(By.cssSelector(object.getProperty("Menu_button"))).click();
		Thread.sleep(2000);
		
		Utility.getscreenshot("VersteckteBadges",driver);				 
		Log.info("VersteckteBadges click");
		Reporter.log("VersteckteBadges click");
		
	}catch(Exception e){
		
		Log.info("VersteckteBadges not click");
		Reporter.log("VersteckteBadges not click");
		throw new Exception();
	}
}
}

