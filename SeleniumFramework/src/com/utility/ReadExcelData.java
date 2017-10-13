package com.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

//import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

       private static XSSFSheet ExcelWSheet;

       private static XSSFWorkbook ExcelWBook;

       private static XSSFCell Cell;
       private static XSSFRow Row;

       // private static XSSFRow Row;

       // This method is to set the File path and to open the Excel file, Pass
       // Excel Path and Sheetname as Arguments to this metho
       public static FileInputStream ExcelFile;

       public static void setExcelFile(String Path, String SheetName)
                    throws Exception {

             try {

                    // Open the Excel file

                    ExcelFile = new FileInputStream(Path);

                    // Access the required test data sheet

                    ExcelWBook = new XSSFWorkbook(ExcelFile);

                    ExcelWSheet = ExcelWBook.getSheet(SheetName);

             } catch (Exception e) {

                    throw (e);

             }

       }

       // This method is to read the test data from the Excel cell, in this we are
       // passing parameters as Row num and Col num

       public static String getCellData(int RowNum, int ColNum) throws Exception {

             try {

                    Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

                    String CellData = Cell.getStringCellValue();

                    return CellData;

             } catch (Exception e) {

                    return "";

             }

       }

       public static String getNumericCellData(int RowNum, int ColNum)
                    throws Exception {

             try {

                    Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

                    if (Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
                           int i = (int) Cell.getNumericCellValue();
                           String strCellValue = String.valueOf(i);
                           return strCellValue;
                    } else {
                           String strCellValue = Cell.getStringCellValue();
                           return strCellValue;
                    }

                    // String CellData = Integer.parseInt(Cell.getNumericCellValue());

             } catch (Exception e) {

                    return "";

             }

       }

       // This method is to write in the Excel cell, Row num and Col num are the
       // parameters

       public static void setCellData(String Result, int RowNum, int ColNum)
                    throws Exception {

             try {

                    Row = ExcelWSheet.getRow(RowNum);

                    Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

                    if (Cell == null) {

                           Cell = Row.createCell(ColNum);

                           Cell.setCellValue(Result);

                    } else {

                           Cell.setCellValue(Result);

                    }

                    // Constant variables Test Data path and Test Data file name

                    FileOutputStream fileOut = new FileOutputStream(
                                 Constant.Path_TestData + Constant.File_TestData);

                    ExcelWBook.write(fileOut);

                    fileOut.flush();

                    fileOut.close();

             } catch (Exception e) {

                    throw (e);

             }

       }

}


