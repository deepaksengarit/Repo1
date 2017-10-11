package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Helper;
import factory.ReturnObjectsDataProvider;

public class Selected_Product_View
{
	WebDriver driver;
	public Selected_Product_View(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS, using=".product-container.productdetails-view.productdetails>h1")
	public WebElement selected_Product_Header;
	
	@FindBy(how=How.CSS, using=".spacer-buy-area>div>div[class='PricesalesPrice vm-display vm-price-value']>span[class='PricesalesPrice']")
	public WebElement Sales_Price;
	
	@FindBy(how=How.CSS, using="div[class='vm-product-container']>div>div>div>form>div>span[class='addtocart-button']>input[name='addtocart']")
	public WebElement Add_To_Cart;
	
	@FindBy(how=How.CSS, using=".showcart.floatright")
	public WebElement Show_cart;
	
	
	public void verify_ProductName_SalesPrice_ProductImage_AddToCart(ExtentTest logger) throws Exception
	{
		Assert.assertEquals(selected_Product_Header.getText().trim(), "Cowboy Hat");
		logger.log(LogStatus.PASS, "selected Product Header VeriFied");
		List<String> price = Helper.convertStringToInteger(Sales_Price.getText().trim(), " ");
		for (String saleRate : price)
		{
			if (saleRate.equals(ReturnObjectsDataProvider.returnConfigObject().getSalesPrice())) 
			{
				logger.log(LogStatus.PASS, "Sales Price Verified");
				System.out.println("Sales price verified");
				break;
			}
		}
		Thread.sleep(5000);
		System.out.println("Before Click");
		Add_To_Cart.click();
		System.out.println("After Click");
		Thread.sleep(3000);
		if (Show_cart.getText().trim().equals("Show Cart"))
		{
			Show_cart.click();
			Thread.sleep(5000);
		}
	}
}
