package com.tasks;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Print the employee ID's of the candiates whose designation is Analyst.
public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> rows=
		driver.findElements(By.xpath("//td[text()='Analyst']/preceding-sibling::td[3]"));
		System.out.println("row Size:: "+rows.size());
		
		List<WebElement> empIds=
				driver.findElements(By.xpath("//td[text()='Analyst']/preceding-sibling::td[3]"));
				
				for(int i=0;i<=rows.size()-1;i++){
					String empIdTxt=empIds.get(i).getText();
					System.out.println(empIdTxt);	
				}
	    }

}
