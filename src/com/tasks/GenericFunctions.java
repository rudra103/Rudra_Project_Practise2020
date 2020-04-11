package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericFunctions {
	public static void  dropDownValues(WebElement element,String value)
	{
		Select sel=new Select(element);
		//sel.selectByVisibleText(value);
		sel.selectByValue(value);
	}
	
	public static void  radioButtonValues(WebDriver driver,String value){
		driver.findElement(By.xpath("//input[@type='radio'][@value='"+value+"']")).click();
   }
}
