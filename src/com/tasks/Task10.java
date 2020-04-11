package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task10 {
  //Click on checkboxes whose email id starts with 'demo'.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> rows=
				driver.findElements(By.xpath("//td[4][contains(text(),'demo')]/preceding-sibling::td[3]"));
				System.out.println("row Size:: "+rows.size());
				
				List<WebElement> empIds=
						driver.findElements(By.xpath("//td[4][contains(text(),'demo')]/preceding-sibling::td[3]"));
						
						for(int i=0;i<=rows.size()-1;i++){
							empIds.get(i).click();
				}
	     }
  }
