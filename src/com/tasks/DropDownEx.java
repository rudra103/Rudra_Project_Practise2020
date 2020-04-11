package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> list=
		driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		
		/*for(WebElement l : list){
			System.out.println(l.getText());
		}
*/		
		WebElement lOption=
		driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select lp=new Select(lOption);
		List<WebElement> lpp=lp.getOptions();
		
		for(WebElement l : lpp){
			System.out.println(l.getText());
		}
	}

}
