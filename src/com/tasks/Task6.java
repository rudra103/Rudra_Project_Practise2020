package com.tasks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Task6 {
//Print the employee Id's of the approved candidates.
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
				driver.findElements(By.xpath("//td[8]"));
				System.out.println("row Size:: "+rows.size());
				
				for(int i=0;i<=rows.size()-1;i++){
					String rs=rows.get(i).getText();
					System.out.println(rs);
				}
				
	}

}
