package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.Cart;
import Pages.Category_Page;
import Pages.Home_Page;
import Pages.OrderConfirmationSuccess;
import Pages.SelectProductAddToCart;
import Pages.Selected_Product_View;
import factory.BrowserFactory;
import factory.ReturnObjectsDataProvider;

public class User_Login 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	//Category_Page cp;
	//Home_Page hp;
	
	@BeforeTest(alwaysRun=true)
	public void setUP()
	{
		report = new ExtentReports(".\\Reports\\VirtueMartTesting.html",true);
		logger = report.startTest("Verify User Checkout Process");
		System.out.println("Inside setUP method");
		driver = BrowserFactory.getDriver("firefox");
		driver.get(ReturnObjectsDataProvider.returnConfigObject().getURL());
		logger.log(LogStatus.INFO, "application is up and running");
	}
	
	@Test(priority = 1, enabled= true)
	public void onHomePage() throws Exception
	{
		System.out.println("WebDriver Value is in Test1 " + driver);
		Home_Page hp = PageFactory.initElements(driver, Home_Page.class);
		hp.title_Verification_Login(logger);
		//hp = new Home_Page(driver);
		//cp = hp.title_Verification_Login();
	}
	
	@Test(priority = 2, enabled= true)
	public void select_Categories() throws Exception
	{
		System.out.println("WebDriver Value is in Test2 " + driver);
		Category_Page cp = PageFactory.initElements(driver, Category_Page.class);
		cp.category_Selection(logger);
	}
	
	@Test(priority = 3, enabled= true)
	public void SelectProductAndAddToCart()
	{
		System.out.println("WebDriver Value is in Test3 " + driver);
		SelectProductAddToCart selctProduct = PageFactory.initElements(driver, SelectProductAddToCart.class);
		selctProduct.verifyPageTitle(logger);
	}
	
	@Test(priority = 4, enabled= true)
	public void SelectedProductOverview() throws Exception
	{
		System.out.println("WebDriver Value is in Test4 " + driver);
		Selected_Product_View Product_view = PageFactory.initElements(driver, Selected_Product_View.class);
		Product_view.verify_ProductName_SalesPrice_ProductImage_AddToCart(logger);
	}
	
	@Test(priority=5, enabled= true)
	public void cart_OverView() throws Exception
	{
		Cart cart = PageFactory.initElements(driver, Cart.class);
		cart.verify_Cart_details_And_CheckOut(logger);
	}
	
	@Test(priority=6, enabled= true)
	public void order_Confirmation_Success()
	{
		OrderConfirmationSuccess orderSuccess = PageFactory.initElements(driver, OrderConfirmationSuccess.class);
		orderSuccess.verify_Order_Details(logger);
	}
	
	@AfterTest(alwaysRun=true)
	public void closeUP()
	{
		/*if (result.getStatus()==ITestResult.FAILURE) 
		{
			String path = Helper.captureScreenshot(driver, result.getName());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(path));
		}*/
	    BrowserFactory.tearDown();
		report.endTest(logger);
		report.flush();
	}
}
