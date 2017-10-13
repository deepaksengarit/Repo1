package com.testcases;



import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.core.Log;
import com.core.TestCore;

import com.utility.Utility;


public class Knowledgebase extends TestCore{


//User selects preferable language
	@Test(priority=1)
	public void test_Login() throws Exception{
		Log.info("Testing Login Page");
		Reporter.log("Testing Login Page");

		
		
		try{
			
			
						
		
			//Click on Knowledgebase
			driver.findElement(By.xpath(object.getProperty("Knowledgebase"))).click();
			 //Click on unit
			driver.findElement(By.xpath(object.getProperty("Unit"))).click();
			 Thread.sleep(2000);
			//click on lesson
			driver.findElement(By.linkText(object.getProperty("Lesson"))).click();
			Thread.sleep(2000);
			//lesson read
 			driver.findElement(By.linkText("Los geht's!")).click();
 			Thread.sleep(2000);
								
			//click on menu button
			driver.findElement(By.cssSelector(object.getProperty("Menu_button"))).click();
			  
			   Thread.sleep(3000);
			 //click on bookmark
	 		driver.findElement(By.xpath("/html/body/div[3]/div[4]/a")).click();
	 			Thread.sleep(4000);
	      //click on menu button
	      driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
	 			  
	 			   Thread.sleep(3000);
			Utility.getscreenshot("Knowledgebase",driver);		
		
			Log.info("Knowledgebase click");
			Reporter.log("Knowledgebase click");
			
		}catch(Exception e){
			
			Log.info("Knowledgebase not click");
			Reporter.log("Knowledgebase not click");
			throw new Exception();
		}
	}
		
	@Test(priority=2)
	public void After_learn_Lesson() throws Exception{
		Log.info("Testing Login Page");
		Reporter.log("Testing Login Page");

		
		
		try{
			
			
						
		
			//Click on Knowledgebase
			driver.findElement(By.xpath(object.getProperty("Knowledgebase"))).click();
			 //Click on unit
			driver.findElement(By.xpath(object.getProperty("Unit"))).click();
			 Thread.sleep(2000);
			//click on lesson
			driver.findElement(By.linkText(object.getProperty("Lesson"))).click();
			Thread.sleep(2000);
			//lesson read
 			driver.findElement(By.linkText("Los geht's!")).click();
 			Thread.sleep(2000);
 			
 			//click on bullet
	 			driver.findElement(By.xpath("/html/body/div[3]/div[8]/section/div/ul/li[2]")).click();
	 			Thread.sleep(3000);
								
			//click on menu button
			driver.findElement(By.cssSelector(object.getProperty("Menu_button"))).click();
			  
			   Thread.sleep(3000);
			
			Utility.getscreenshot("LearnLessonAgain",driver);		
		
			Log.info("LearnLessonAgain click");
			Reporter.log("LearnLessonAgain click");
			
		}catch(Exception e){
			
			Log.info("LearnLessonAgain not click");
			Reporter.log("LearnLessonAgain not click");
			throw new Exception();
		}
	}
		@Test(priority=3)
		public void Click_Lesson_Link() throws Exception{
			Log.info("Testing Login Page");
			Reporter.log("Testing Login Page");

			
			
			try{
				
				
							
			
				//Click on Knowledgebase
	 			driver.findElement(By.xpath("/html/body/div[3]/div[5]/section/form/div/nav/ul/li[1]/a")).click();
	 			 //Click on unit
	 			driver.findElement(By.xpath("//*[@id='headingOne']/h4/a/span")).click();
	 			 Thread.sleep(2000);
	 			//click on lesson
	 			driver.findElement(By.linkText("HIV")).click();
	 			Thread.sleep(2000);
	 			
	 		
	 		
	 			
	 		driver.findElement(By.xpath("/html[@class=' overthrow-enabled']/body[@class='ng-scope']/div[@class='ng-view main_frame ng-scope']/div[@class='knoweledge_bg ng-scope']/div[@class='container']/section[@class='section_firstreg edit_profile terms_conditions']/form[@class='second_step dashboard_blue ng-pristine ng-valid']/div[@class='whitebg padding_default']/div[@class='form_row padding_default margin_default']/div[@id='accordion']/div[@class='panel panel-default']/div[@class='displayContainer']/div[@id='collapseOne'][4]/div[@id='collapseOne']/div[@class='panel-body submenu']/div/h4[@class='panel-title']/a/span[@class='ng-binding']")).click();
	 			Thread.sleep(2000);
		 			System.out.println("Knowledgbase");	
		 			
	 			//click on link
	 			driver.findElement(By.cssSelector("#page_data > p:nth-child(3) > a")).click();
	 			  
	 			   Thread.sleep(3000);
	 			   
	 			  driver.navigate().back();
	 			  Thread.sleep(3000);
	 			
	 	 		//click on menu button
	 	 			 driver.findElement(By.cssSelector("#common_header > div.header > div:nth-child(3) > img")).click();
	          
				
				Utility.getscreenshot("LearnLessonAgain",driver);		
			
				Log.info("LearnLessonAgain click");
				Reporter.log("LearnLessonAgain click");
				
			}catch(Exception e){
				
				Log.info("LearnLessonAgain not click");
				Reporter.log("LearnLessonAgain not click");
				throw new Exception();
			}
		
	}
		
	
	}

	


