package DownloadFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
 
 
public class DownloadFiles {
 
public static void main(String[] args) throws InterruptedException {
  
// Create a profile
FirefoxProfile profile=new FirefoxProfile();
 
// Set preferences for file type 
profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
  


System.setProperty("webdriver.gecko.driver","E:\\2016\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

  
// Set implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
// Maximize window
driver.manage().window().maximize();
  
// Open APP to download application
driver.get("http://filehippo.com/download_vlc_media_player/64/");
  
// Click on download 
driver.findElement(By.cssSelector("..program-header-download-link.green.button-link.active.long.btn")).click();
Thread.sleep(3000);
    
 }
 
}