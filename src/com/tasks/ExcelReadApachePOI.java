package com.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReadApachePOI {
	public static void main(String[] args) throws IOException {
	 
	 try {
		FileInputStream inputStream=new FileInputStream("C:\\Users\\user\\Desktop\\Students.xlsx");
		 XSSFWorkbook wBook=new XSSFWorkbook(inputStream);
		 XSSFSheet sheet=wBook.getSheet("readData");
		 int rows=sheet.getLastRowNum()+1;
		 System.out.println("No Of rows in excel file :: "+rows);		 
		 
		for(int i=0;i<rows;i++){
		    int colunsCount=sheet.getRow(i).getLastCellNum(); 
		   for(int j=0;j<colunsCount;j++){
		       
			   Cell cell=sheet.getRow(i).getCell(j);
			   cell.setCellType(cell.CELL_TYPE_STRING);
			   System.out.print(cell.getStringCellValue()+"\t");
		   }
		 }
		 inputStream.close();
		 wBook.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
     
   }
}
