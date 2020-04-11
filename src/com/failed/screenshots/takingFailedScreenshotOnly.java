package com.failed.screenshots;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class takingFailedScreenshotOnly extends screenshotBase
{
	@BeforeMethod
	public void bMethod() throws Exception{
		intilization();
	}
	
	@Test
	public void homepageTest(){
		Assert.assertTrue(false);
    }
	
	@Test
	public void loginTest(){
		Assert.assertTrue(false);
    }
	
	@Test
	public void verifytestTest(){
		Assert.assertTrue(false);
    }
	
	@AfterMethod
	public void aMethod(){
		driver.close();
	}
}
