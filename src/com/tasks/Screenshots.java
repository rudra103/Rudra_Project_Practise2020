package com.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html
import com.utilities.UtilitySC;

public class Screenshots {
     @Test
	 public void screenShotEx() throws Exception{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@class='inputtext'][@type='email']")).sendKeys("Sample2345");
		 UtilitySC.captureScreenshot(driver, "fbMyName999");
		 
		 driver.close();
	 }
	
}
