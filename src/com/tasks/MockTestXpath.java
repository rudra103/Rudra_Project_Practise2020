package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MockTestXpath {
	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	//Options which are greater than 5	
	List<WebElement> list=driver.findElements(By.xpath("//select[@name='birthday_day']/option[@value>5]"));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
	//Print all children of select tag 
		List<WebElement> list2=driver.findElements(By.xpath("//select[@name='birthday_day']/child::option"));
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i).getText());
		}	
		//Print the option 9
		List<WebElement> list3=driver.findElements(By.xpath("//select[@name='birthday_day']/option[10]"));
		for(int i=0;i<list3.size();i++){
			System.out.println(list3.get(i).getText());
		}		
		//Print the options between Day and option 10
		List<WebElement> list4=driver.findElements(By.xpath("//select[@name='birthday_day']//option[@value >-1 and @value <=10]"));
		for(int i=0;i<list4.size();i++){
			System.out.println(list4.get(i).getText());
		}	
	}
}
