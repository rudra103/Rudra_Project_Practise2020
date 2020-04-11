package com.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSelection {
	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		GenericFunctions.radioButtonValues(driver, "1"); 
	}
}
