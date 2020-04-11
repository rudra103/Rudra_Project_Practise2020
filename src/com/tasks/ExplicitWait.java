package com.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
	WebDriver driver;
	driver=new FirefoxDriver();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
    
    WebDriverWait wait=new  WebDriverWait(driver, 10);
    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
    
    
		//WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		if(element.isDisplayed()){
			System.out.println("Element  Found<<>>");	
		}
		else {
		System.out.println("Element Not Found<<>>");
		}
}

}
