package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import Data_Provider.ConfigDataProvider;
import factory.ReturnObjectsDataProvider;


public class OrderConfirmationSuccess 
{
	WebDriver driver;
	ConfigDataProvider configObject;
	
	public OrderConfirmationSuccess(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS, using=".vm-wrap.vm-order-done>h3")
	private WebElement header3;
	
	public void verifyPageTitle()
	{
		configObject  = ReturnObjectsDataProvider.returnConfigObject();
		Assert.assertEquals(configObject.orderSuccessTitle(), driver.getTitle().trim());
	}
	
	public void verify_Order_Details(ExtentTest logger)
	{
		verifyPageTitle();
		Assert.assertEquals(configObject.orderSuccessTitle(), header3.getText().trim());
	}
}
