package com.tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2017");
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window Handle :: "+parent);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String child : allWindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium Automation");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();
	}
}
