package Data_Provider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("./Test_Data/AppData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	public String getData(String sheetName, int rownum, int cellnum)
	{
		String data = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
}
