package com.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {
 WebDriver driver;
 
@BeforeMethod
public void launch(){
	driver=new FirefoxDriver();
	driver.get("http://testingmasters.com/hrm");
	driver.manage().window().maximize();
}


@AfterMethod
public void close(){
	driver.close();
   }
}
