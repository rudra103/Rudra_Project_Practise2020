package com.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsScripts4 {
    
	@Test
	public void TC03(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		String expected=driver.getTitle();
		String actual="OrangeHRM";
		//String pageSource=driver.getPageSource();
		System.out.println(expected);
		//Assert.assertEquals(actual,expected);
		Assert.assertTrue(expected.equals("OrangeHRM"));
		System.out.println("Test Completed Successfully");
	}
	
}
