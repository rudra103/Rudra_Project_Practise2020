package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9 {
    //Clik on checkboxes of last 4 records.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
				System.out.println("row Size:: "+rows.size());
				
				List<WebElement> empIds=
						driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
						for(int i=rows.size()-1;i>=8;i--){
							empIds.get(i).click();
				}
	      }
  }
