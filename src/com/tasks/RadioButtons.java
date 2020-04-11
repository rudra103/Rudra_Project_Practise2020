package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08");
		 List<WebElement> list=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		 int size=list.size();
		 System.out.println("Size is :: "+size);
		 for(int i=0;i<list.size();i++){
			 WebElement wele=list.get(i);
			  String val=wele.getAttribute("value");
			 System.out.println("value is :: "+val);
			 if(val.equals("RUBY")){
				 wele.click();
			 }
		 }
		 
	}

}
