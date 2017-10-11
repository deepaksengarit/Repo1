package factory;

import Data_Provider.ConfigDataProvider;
import Data_Provider.ExcelDataProvider;

public class ReturnObjectsDataProvider 
{
	public static ConfigDataProvider returnConfigObject()
	{
		ConfigDataProvider confDataPro = new ConfigDataProvider();
		return confDataPro;
	}
	
	public static ExcelDataProvider returnExcelObject()
	{
		ExcelDataProvider excelProvider = new ExcelDataProvider();
		return excelProvider;
	}
}
