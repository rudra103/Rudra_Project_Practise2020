package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownListFetching {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule")));
		obj.build().perform();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		List<WebElement> leavesType=
		             driver.findElements(By.xpath("//select[@id='applyleave_txtLeaveType']/child::option"));
		int size=leavesType.size();
		System.out.println("No Of Values Count in the List ::"+size);
		System.out.println("List Of Values in the LeaveType are ::-");
		for(int i=0;i<=leavesType.size()-1;i++){
			String lData=leavesType.get(i).getText();
			System.out.println(lData);
		}
	}

}
