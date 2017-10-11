package Data_Provider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties properties;
	
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
			System.out.println("Properties files loaded");
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getURL()
	{
		return properties.getProperty("URL");
	}
	
	public String getChromePath()
	{
		return properties.getProperty("ChromePath");
	}
	
	public String getIEPath()
	{
		return properties.getProperty("IEPath");
	}
	
	public String getSiteTitle()
	{
		return properties.getProperty("title");
	}
	
	public String getSelectedCategory()
	{
		return properties.getProperty("selected_Category");
	}
	
	public String getSalesPrice()
	{
		return properties.getProperty("sales_Price");
	}
	
	public String getcowboy_hat_detail()
	{
		return properties.getProperty("cowboy-hat-detail");
	}
	
	public String discountedPrice()
	{
		return properties.getProperty("PricediscountedPriceWithoutTax");
	}
	
	public String getTaxAmount()
	{
		return properties.getProperty("taxAmount");
	}
	
	public String getShipmentName()
	{
		return properties.getProperty("shipment");
	}
	
	public String getShipmentPrice()
	{
		return properties.getProperty("shipmentPrice");
	}
	
	public String getPaymentMethod()
	{
		return properties.getProperty("paymentMethod");
	}
	
	public String getFinalAmount()
	{
		return properties.getProperty("finalAmount");
	}
	
	public String orderSuccessTitle()
	{
		return properties.getProperty("orderSuccessTitle");
	}
}
