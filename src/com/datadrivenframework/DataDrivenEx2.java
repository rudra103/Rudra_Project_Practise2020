package com.datadrivenframework;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenEx2 {
	@Test(dataProvider="hrmApplication")
	public void hrmLoginApplication(String userName,String passWord) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();;
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String exp=driver.getCurrentUrl();
		
		if(exp.contains("dashboard")){
		  System.out.println("User Can Login into HRM application");
		}
		else{
			System.out.println("User Can't able Login into HRM application");
		   }
		Thread.sleep(3000);
		driver.close();//OrangeHRM
	}
	
	
	@DataProvider(name="hrmApplication")
	public Object[][] passData() throws IOException{
		DataDrivenEx excelConfig=new DataDrivenEx("C:\\Users\\user\\git\\PractiseRepository\\Rudra_Project\\TestData\\InPutData.xlsx");
		int rows=excelConfig.getNoOfRows(0);//0 means firstSheet in excel
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++){
			data[i][0]=excelConfig.getDataExcel(0, i, 0);
			data[i][1]=excelConfig.getDataExcel(0, i, 1);
		}
		return data;
	}
}
