package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownSelectEx {
	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement selVal=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		GenericFunctions.dropDownValues(selVal, "12");
	}
}
