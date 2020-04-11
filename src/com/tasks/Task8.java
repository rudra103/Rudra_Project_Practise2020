package com.tasks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task8 {
    //Click on checkboxes of first five records.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
				System.out.println("row Size:: "+rows.size());
				
				List<WebElement> empIds=
						driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
						
						for(int i=0;i<=4;i++){
							empIds.get(i).click();
				}
	    }
}
