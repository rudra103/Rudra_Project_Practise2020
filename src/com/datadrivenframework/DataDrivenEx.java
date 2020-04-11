package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenEx {
	XSSFWorkbook wBook;
	XSSFSheet sheet;
	
	//this Constuctor load into workbook
	public DataDrivenEx(String excelPath) throws IOException{
		FileInputStream finput;
		finput=new FileInputStream(excelPath);
		wBook=new XSSFWorkbook(finput);
	}
	
	//this method will return data based upon the parameters sheet number,row,column
	
	public String getDataExcel(int sheetNum,int rowNum,int colNum){
		sheet=wBook.getSheetAt(sheetNum);
		String data=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}
	
	//this method will return the No Of Rows based upon parameter Sheet Number
	public int getNoOfRows(int sheetIndex){
		sheet=wBook.getSheetAt(sheetIndex);
		int rows=sheet.getLastRowNum();
		rows=rows+1;
		
		return rows;
	}
}
