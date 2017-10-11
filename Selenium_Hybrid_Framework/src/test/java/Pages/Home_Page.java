package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Helper;
import factory.ReturnObjectsDataProvider;

public class Home_Page 
{
	WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("WebDriver Value inside Home_Page is " + driver);
	}
	
	@FindBy(how=How.CSS, using=".accept")
	public WebElement accept_Pop_Up;
	
	@FindBy(how=How.CSS, using="#modlgn-username")
	public WebElement username;
	
	@FindBy(how=How.CSS, using="#modlgn-passwd")
	public WebElement password;
	
	@FindBy(how=How.CSS, using=".moduletable>form>fieldset>input[type='submit']")
	public WebElement submit_Button;
	
	
	public void title_Verification_Login(ExtentTest logger) throws Exception
	{
		Thread.sleep(2000);
		accept_Pop_Up.click();
		Thread.sleep(2000);
		String login_Page_Title = driver.getTitle().trim();
		Assert.assertEquals(login_Page_Title, ReturnObjectsDataProvider.returnConfigObject().getSiteTitle());
		logger.log(LogStatus.PASS, "Home Page title is verified");
		username.sendKeys(ReturnObjectsDataProvider.returnExcelObject().getData("User_Data", 1, 0));
		password.sendKeys(ReturnObjectsDataProvider.returnExcelObject().getData("User_Data", 1, 1));
		submit_Button.click();
		Thread.sleep(5000);
		logger.log(LogStatus.PASS, "Login Successfull");
		System.out.println("WebDriver Value inside title_Verification_Login"+ driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenshot(driver, "Login_Sucess")));
		//return new Category_Page(driver);
		
	}
}
