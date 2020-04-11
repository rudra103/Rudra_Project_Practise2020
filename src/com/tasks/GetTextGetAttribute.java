package com.tasks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextGetAttribute {
	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
        WebElement ele=driver.findElement(By.xpath("//select[@name='birthday_month']//option[1]"));
		ele.getText();
		System.out.println("Text in the Tag :: "+ele.getText());
		
		System.out.println("Value Attribute data in the tag :: "+ele.getAttribute("value"));
	}

}
