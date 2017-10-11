package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Helper;
import factory.ReturnObjectsDataProvider;

public class SelectProductAddToCart 
{
	WebDriver driver;
	public SelectProductAddToCart(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS, using=".browse-view>h1")
	public WebElement pageHeader;
	
	@FindBy(how=How.CSS, using=".featured-view>div>div>div[class='spacer product-container']>div>h2>a")
	public List<WebElement> Product_Details;
	
	public void verifyPageTitle(ExtentTest logger)
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, ReturnObjectsDataProvider.returnConfigObject().getSelectedCategory());
		logger.log(LogStatus.PASS, "Category page title verified");
		System.out.println("Page title verified");
		verifyPageHeader(logger);
	}
	
	public void verifyPageHeader(ExtentTest logger)
	{
		Assert.assertEquals(pageHeader.getText().trim(), ReturnObjectsDataProvider.returnConfigObject().getSelectedCategory());
		//Assert.assertEquals(Featured_Products.getText().trim(), "Featured Products");
		logger.log(LogStatus.PASS, "Page Header verified");
		try {
			addSelectedProductToCart(logger);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void addSelectedProductToCart(ExtentTest logger) throws Exception
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		System.out.println("Product_Details List size is "+ Product_Details.size());
		for (WebElement feature_Prod : Product_Details) 
		{
			if (feature_Prod.getText().trim().equals("Cowboy Hat")) 
			{
				feature_Prod.click();
				Thread.sleep(5000);
				logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenshot(driver, "Selected_Product")));
				break;
			}
		}
	}
	
	 
}
