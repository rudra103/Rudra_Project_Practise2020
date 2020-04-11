package com.tasks;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window Handle :: "+parent);
		
		Set<String> allWindows=driver.getWindowHandles();
		
		ArrayList<String > tabs=new ArrayList<>(allWindows);//Converting Set to ArrayList
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
	
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	
	}
}
