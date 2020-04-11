package com.tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class ExcelWriteApachePOI {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();;
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='applyleave[txtLeaveType]']//option[@value>0]"));
		for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i).getText());
	      }
		
		 try {
			FileInputStream inputStream=new FileInputStream("C:\\Users\\user\\Desktop\\Students.xlsx");
			 XSSFWorkbook wBook=new XSSFWorkbook(inputStream);
			 XSSFSheet sheet=wBook.getSheet("getData");
			
			  for(int i=0,j=0;i<list.size();i++){
				  Row row=sheet.createRow(i);
				  Cell cell=row.createCell(j);
				  cell.setCellType(cell.CELL_TYPE_STRING);
				  cell.setCellValue(list.get(i).getText());
			  }
			  FileOutputStream fout=new FileOutputStream("C:\\Users\\user\\Desktop\\Students.xlsx");
			  wBook.write(fout);
			  inputStream.close();
			  fout.close();
			  wBook.close();
System.out.println("Excel Writing Done...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
