package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task7 {
	//Click on the checkboxes of the records whose username is Vinod and Designation is analyst.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//td[text()='Vinod']/following-sibling::td[2][text()='Analyst']/preceding-sibling::td[4]"));
				System.out.println("row Size:: "+rows.size());
				
				List<WebElement> empIds=
						driver.findElements(By.xpath("//td[text()='Vinod']/following-sibling::td[2][text()='Analyst']/preceding-sibling::td[4]"));
						
						for(int i=0;i<=rows.size()-1;i++){
							empIds.get(i).click();
					}
	}

}
