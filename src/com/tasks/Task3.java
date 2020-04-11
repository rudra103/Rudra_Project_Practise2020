package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {
    //Click on the checkboxes of the records whose Designation is Manager.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//td[5][text()='Manager']/preceding-sibling::td[4]"));
				System.out.println("row Size:: "+rows.size());
				
				List<WebElement> empIds=
						driver.findElements(By.xpath("//td[5][text()='Manager']/preceding-sibling::td[4]"));
						
						for(int i=0;i<=rows.size()-1;i++){
							empIds.get(i).click();
					}
						System.out.println("No Of Elements Clicked :: "+empIds.size());
			}
	}
