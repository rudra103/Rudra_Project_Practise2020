package Jaswanth.Automation.Script;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.jna.platform.win32.ShellAPI.SHFILEOPSTRUCT;
public class readExcel2 {
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis=new  FileInputStream("C:/Users/user/Desktop/sample.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		int roCount=sheet1.getLastRowNum();
		int colCount2=sheet1.getRow(0).getLastCellNum();
		
		System.out.println("Row Count : "+roCount);
		System.out.println("Column Count : "+colCount2);
		for(int i=1;i<=roCount;i++){
		
			int colCount=sheet1.getRow(i).getLastCellNum();
		for(int j=0;j<colCount;j++){
			
			String dataValue=sheet1.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println(dataValue);
		  }	
		}
		
	}
}
