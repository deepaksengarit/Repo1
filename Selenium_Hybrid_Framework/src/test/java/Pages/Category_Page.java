package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Helper;
import factory.ReturnObjectsDataProvider;

public class Category_Page 
{
	WebDriver driver;
	
	public Category_Page(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("WebDriver Value inside Category_Page is " + driver);
	}
	
	@FindBy(how=How.CSS, using=".category-view>div>div>div>h2>a")
	public List<WebElement> categories_list;
	
	
	public void category_Selection(ExtentTest logger) throws Exception
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 300);");
		logger.log(LogStatus.INFO, "Windows scrolled down");
		Thread.sleep(3000);
		System.out.println("List length is "+ categories_list.size());
		for (WebElement category : categories_list) {
			//System.out.println("Category is "+ category.getText());
			if (category.getText().trim().equals(ReturnObjectsDataProvider.returnConfigObject().getSelectedCategory())) 
			{
				category.click();
				Thread.sleep(3000);
				logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenshot(driver, "Selected_Category")));
				logger.log(LogStatus.PASS, "Category Selected");
				break;
			}
		}
		Thread.sleep(5000);
	}
}
