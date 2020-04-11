package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.NopCommerceRegister;

public class Register {

	public static WebDriver driver=new FirefoxDriver();
	public static void main(String[] args) {
		driver.get("https://www.nopcommerce.com/register.aspx");
		NopCommerceRegister ncr=PageFactory.initElements(driver,NopCommerceRegister.class);
		ncr.register();
	}

}
