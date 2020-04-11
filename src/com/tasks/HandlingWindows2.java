package com.tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window Handle :: "+parent);
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String child : allWindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				System.out.println("Window Title is :: "+driver.getTitle());
				
				Thread.sleep(3000);
				if(driver.getTitle().equalsIgnoreCase("Amazon")){
					driver.close();
				}
			}
		}
		driver.switchTo().window(parent);
		driver.close();
	}
}
