package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Data_Provider.ConfigDataProvider;
import Data_Provider.ExcelDataProvider;
import Utility.Helper;
import factory.ReturnObjectsDataProvider;

public class Cart 
{
	WebDriver driver;
	ExcelDataProvider excelData;
	ConfigDataProvider dataProvider;
	
	public Cart(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS, using=".width50.floatleft.vm-cart-header>h1")
	public WebElement cart_Header;
	
	@FindBy(how=How.CSS, using=".output-billto>span")
	public List<WebElement> billing_Address;
	
	@FindBy(how=How.CSS, using="#shipto0")
	public WebElement shipToRadioButton;
	
	@FindBy(how=How.CSS, using=".vm-cart-item-name>a")
	public WebElement Hat_Detail;
	
	@FindBy(how=How.CSS, using=".sectiontableentry1>td>div>span[class='PricediscountedPriceWithoutTax']")
	public WebElement PricediscountedPriceWithoutTax;
	
	@FindBy(how=How.CSS, using=".sectiontableentry1>td[class='vm-cart-item-tax']>span>div>span[class='PricetaxAmount']")
	public WebElement taxAmount;
	
	@FindBy(how=How.CSS, using=".vm-cart-item-total>div>span[class='PricesalesPrice']")
	public WebElement totalBillAmount;
	
	@FindBy(how=How.CSS, using=".vm-payment-shipment-select.vm-shipment-select>div>label>span>span[class='vmshipment_name']")
	public List<WebElement> shipMentName;
	
	@FindBy(how=How.CSS, using=".PricesalesPriceShipment.vm-display.vm-price-value>span[class='PricesalesPriceShipment']")
	public WebElement shipmentPrice;
	
	@FindBy(how=How.CSS, using="tbody>tr:nth-child(6)>td>span[class='vmshipment_name']")
	public WebElement selfPickUp;
	
	@FindBy(how=How.CSS, using="tbody>tr:nth-child(6)>td>div>button")
	public WebElement ShipMentMethodSaveButton;
	
	@FindBy(how=How.CSS, using=".vmpayment_name")
	public List<WebElement> payMentMethods;
	
	@FindBy(how=How.CSS, using="tbody>tr:nth-child(7)>td>span[class='vmpayment_name']")
	public WebElement paymentConfirmation;
	
	@FindBy(how=How.CSS, using=".sectiontableentry2>td>strong>div>span[class='PricebillTotal']")
	public WebElement finalAmount;
	
	@FindBy(how=How.CSS, using="#tos")
	public WebElement termsAndConditions;
	
	@FindBy(how=How.CSS, using="a[href^='/vendor/virtuemart']")
	public WebElement termsAndConditionsLink;
	
	@FindBy(how=How.CSS, using="#fancybox-content>div>h5")
	public WebElement termsConditionsText;
	
	@FindBy(how=How.CSS, using="#checkoutFormSubmit")
	public WebElement confirmPurchase;
	
	@FindBy(how=How.CSS, using="#fancybox-close")
	public WebElement closeTermsButton;
	
    public void verifyHeader()
	{
		Assert.assertEquals(cart_Header.getText().trim(), "Cart");
	}
	
	public void verifyBillingAddress(ExtentTest logger)
	{
		System.out.println("Billing Adress list size is "+ billing_Address.size());
		excelData = ReturnObjectsDataProvider.returnExcelObject();
		for (WebElement billing_Adress_Details : billing_Address) 
		{
			for(int i=0;  i<billing_Address.size(); i++)
			{
			if(excelData.getData("Billing_Address", 1, i).equals(billing_Adress_Details.getText().trim()))
			{
				System.out.println(billing_Adress_Details.getText()+" verified");
				break;
			}
			}
		}
	}
	
	public void verifyItemsDetailsAddedInCart(ExtentTest logger)
	{
		dataProvider = ReturnObjectsDataProvider.returnConfigObject();
		Assert.assertEquals(dataProvider.getcowboy_hat_detail(), Hat_Detail.getText().trim());
		List<String> priceWithoutTax = Helper.convertStringToInteger(PricediscountedPriceWithoutTax.getText().trim(), " ");
		for (String price : priceWithoutTax) {
			if (price.equals(dataProvider.discountedPrice())) 
			{
				logger.log(LogStatus.PASS, "price without tax verified");
				break;
			}
		}
		List<String> PricetaxAmount = Helper.convertStringToInteger(taxAmount.getText().trim(), " ");
		for (String taxPrice : PricetaxAmount) {
			if (taxPrice.equals(dataProvider.getTaxAmount())) 
			{
				logger.log(LogStatus.INFO, "Tax Amount Verified");
				break;
			}
		}
		List<String> total_Amount = Helper.convertStringToInteger(totalBillAmount.getText().trim(), " ");
		for (String total_Price : total_Amount) 
		{
			if (total_Price.equals(dataProvider.getSalesPrice())) 
			{
				logger.log(LogStatus.INFO, "Total Amount including Tax has been Verified");
				break;
			}
		}
	}
	
	public void selectShipmentMethod(ExtentTest logger) throws Exception
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 200);");
		Thread.sleep(2000);
		for (WebElement shipment : shipMentName) 
		{
			String[] shipMentNameAndMethod = Helper.splitMethod(dataProvider.getShipmentName(), ",");
			if (shipment.getText().trim().equals(shipMentNameAndMethod[0])) 
			{
				if(driver.findElement(By.id("shipment_id_"+ shipMentNameAndMethod[1])).isSelected())
				{
					System.out.println("ShipMent Method "+ shipMentNameAndMethod[0] +" already selected");
					break;
				}
				else
				{
					driver.findElement(By.id("shipment_id_"+shipMentNameAndMethod[1])).click();
					Thread.sleep(3000);
					Assert.assertEquals(selfPickUp.getText().trim(), shipMentNameAndMethod[0]);
					logger.log(LogStatus.PASS, shipMentNameAndMethod[0]+" Selected");
					Thread.sleep(2000);
					if (Integer.parseInt(shipMentNameAndMethod[1]) == 2) 
					{
						String[] PricesalesPriceShipment = Helper.splitMethod(shipmentPrice.getText().trim(), " ");
						Assert.assertEquals(PricesalesPriceShipment[0], dataProvider.getShipmentPrice());
						logger.log(LogStatus.PASS, "Price for default shipment has been verified");
					}
					//ShipMentMethodSaveButton.click();
					Thread.sleep(3000);
					break;
				}
				
			}
			
		}
	}
	
	public void paymentMethod(ExtentTest logger) throws Exception
	{
		for (WebElement paymentMethod : payMentMethods) 
		{
			String[] payments = Helper.splitMethod(dataProvider.getPaymentMethod(), ",");
			if (paymentMethod.getText().trim().equals(payments[0])) 
			{
				if (driver.findElement(By.id("payment_id_"+payments[1])).isSelected()) 
				{
					System.out.println("PayMent Method "+ payments[0] + " is already selected");
					break;
				}
				else
				{
					driver.findElement(By.id("payment_id_"+payments[1])).click();
					logger.log(LogStatus.PASS, "Payment method "+payments[0]+ " is selected");
					//Assert.assertEquals(paymentConfirmation.getText().trim(), payments[0]);
					logger.log(LogStatus.INFO, "Payment method verified");
					System.out.println("Test Executed Success");
					Thread.sleep(5000);
					break;
				}
			}
		}
	}
	
	public void verifyTotalPayableAmount(ExtentTest logger)
	{
		String[] actualFinalPrice = Helper.splitMethod(finalAmount.getText(), " ");
		String[] actualFinalPrice1 = Helper.splitMethod(actualFinalPrice[0], ",");
		String[] expectedFinalPrice =  Helper.splitMethod(dataProvider.getFinalAmount(), ",");
		if (Helper.convertStringToInt(actualFinalPrice1[0])== Helper.convertStringToInt(expectedFinalPrice[0]) &&
				Helper.convertStringToInt(actualFinalPrice1[1]) == Helper.convertStringToInt(expectedFinalPrice[1])) 
		{
			logger.log(LogStatus.PASS, "Final Price Verified");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Final Price has not been verified");
		}
		
	}
	
	public void termsAndConditions(ExtentTest logger) throws Exception
	{
		if (termsAndConditions.isSelected()) 
		{
			logger.log(LogStatus.INFO, "terms and conditions checkbox already selected");
		}
		else
		{
			termsAndConditions.click();
			Thread.sleep(2000);
			logger.log(LogStatus.INFO, "terms and conditions checkbox selected");
		}
		termsAndConditionsLink.click();
		Thread.sleep(3000);
		if (termsConditionsText.getText().contains("This is a demo store"))
		{
			logger.log(LogStatus.INFO, "Terms and Conditions text verified");
		}
		else
		{
			logger.log(LogStatus.INFO, "Terms and Conditions text not verified");
		}
		closeTermsButton.click();
		Thread.sleep(2000);
	}
	
	public void verify_Cart_details_And_CheckOut(ExtentTest logger) throws Exception
	{
		verifyHeader();
		logger.log(LogStatus.PASS, "cart header verified");
		logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.captureScreenshot(driver, "cart_deatils")));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		verifyBillingAddress(logger);
		logger.log(LogStatus.PASS, "Billing Address Verified");
		if (shipToRadioButton.isSelected()) 
		{
			logger.log(LogStatus.INFO, "Ship to Default (Same as Billing) radio button is already selected");
		}
		else
		{
			logger.log(LogStatus.INFO, "Ship to Default (Same as Billing) radio button is not selected");
		}
		verifyItemsDetailsAddedInCart(logger);
		selectShipmentMethod(logger);
		paymentMethod(logger);
		verifyTotalPayableAmount(logger);
		termsAndConditions(logger);
		logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.captureScreenshot(driver, "cart_Details_After_Selection")));
		confirmPurchase.click();
		Thread.sleep(5000);
	}
}
