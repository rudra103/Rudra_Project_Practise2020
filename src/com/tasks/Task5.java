package com.tasks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//Reject the leaves applied by Analyst.
public class Task5 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//td[5][text()='Analyst']/following-sibling::td[3]/select"));
				System.out.println("row Size:: "+rows.size());
				
				for(WebElement we : rows){
					String w=we.getText();
					System.out.println(w);
					if(!we.equals("Rejected")){
						Select dropDown=new Select((WebElement) rows);
						dropDown.selectByVisibleText("Rejected");
					}
				}
	   }

}
