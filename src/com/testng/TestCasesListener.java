package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestCasesListener {
	@Test
    public void verifyTestingMastersHrmTitle()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	System.out.println(driver.getTitle());
	driver.close();
   }
	
	@Test
    public void matchTitle()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	String title=driver.getTitle();
	Assert.assertTrue(title.equals("Orange hrm"));
	driver.close();
   }
}
