package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.get("https://www.google.co.in/");
		//WebElement menu=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		WebElement gmaillnk=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac=new Actions(driver);
		//ac.moveToElement(menu).perform();
		ac.contextClick(gmaillnk).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//driver.close()\
	}
}
