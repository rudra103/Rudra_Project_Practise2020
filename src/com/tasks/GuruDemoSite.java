package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GuruDemoSite {
	public static void main(String[] args) {
	      //Getting Xpath through Label
		    WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.guru99.com/V4/");
			WebElement uName=
			driver.findElement(By.xpath("//td[text()='UserID']/following-sibling::td//input"));
		    uName.sendKeys("admin");
		    WebElement pSWD=
		    driver.findElement(By.xpath("//td[text()='Password']/following-sibling::td//input"));
		    pSWD.sendKeys("admin");
		    driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}
