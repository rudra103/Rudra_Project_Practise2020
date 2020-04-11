package com.failed.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotBase {

	public static WebDriver driver;
	
	
	public static void intilization() throws Exception{
		  System.setProperty("webdriver.chrome.driver", 
	               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.naukri.com");
            Thread.sleep(1000);
	}
	
	public void failed(String filename){
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				try {
					FileUtils.copyFile(src, new File(".//test-output//Screenshots//"+filename+".png"));
				} catch (Exception e) {
					  e.printStackTrace();
				}
	    }
	
}
