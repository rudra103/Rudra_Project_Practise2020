package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadrivenframework.DataDrivenEx;

public class YoutubeMateDownload {
    @Test(dataProvider="youtubemate")
    public static void dowloadFromYoutubemate(String path)
    {
        try {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://y2mate.com/");
			WebElement element=
			driver.findElement(By.xpath("//input[@class='form-control input-lg'][@placeholder='Search or paste link here...']"));
			element.sendKeys(path);
			driver.findElement(By.xpath("//button[@value='Start'][@id='btn-submit']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[@class='tab-content']/div[1]/table//thead/following::tr[1]/child::td[3]/a")).click();
		    Thread.sleep(3000);
        } catch (Exception e) {
			e.printStackTrace();
		}
	}
 
    @DataProvider(name="youtubemate")
    public Object[][] passData() throws IOException{
    	DataDrivenEx dd=new DataDrivenEx("C:\\Users\\user\\Desktop\\Urls.xlsx");
    	int rows=dd.getNoOfRows(0);
    	
    	Object[][] data=new Object[rows][1];
    	
    	for(int i=0;i<rows;i++){
    	   data[i][0]=dd.getDataExcel(0, rows, 0);
    	}
    	return data;
    }
    
}
