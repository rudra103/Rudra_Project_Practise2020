package Jaswanth.Automation.Script;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readExcel {
	public static void main(String[] args) throws Exception {
		
		File file=new File("C:/Users/user/Desktop/sample.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		
		String cellValue1=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from row 0 cell 0 : "+cellValue1);
		
        String cellValue2=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from row 0 cell 0 : "+cellValue2);
		
		workbook.close();
	}
}
