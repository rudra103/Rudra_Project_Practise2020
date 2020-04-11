package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Child extends Parent 
{
@Test
public void TC03_ContactDetails(){
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    
	driver.findElement(By.xpath("//b[text()='My Info']")).click();
	driver.findElement(By.xpath("//a[text()='Contact Details']")).click();
    driver.findElement(By.xpath("//input[@value='Edit']")).click(); 
	WebElement add=
	driver.findElement(By.xpath("//input[@id='contact_street1']"));
	add.clear();
	add.sendKeys("Hitech City");
	WebElement state=
	driver.findElement(By.xpath("//input[@id='contact_province']"));
	state.clear();
	state.sendKeys("Andhra Pradesh");
	WebElement zcode=
	driver.findElement(By.xpath("//input[@id='contact_emp_zipcode']"));
	zcode.clear();
	zcode.sendKeys("500082");
	driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select/option[100]")).click();
	//driver.findElement(By.xpath("//input[@value='Save']")).click();
   }

@Test
public void TC03_Qualifications_Add_Workexperince(){
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.findElement(By.xpath("//b[text()='My Info']")).click();
	
	driver.findElement(By.xpath("//a[text()='Qualifications']")).click();
	driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
    
	driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("CGI");
	driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("Automation Engineer");
	WebElement from=
	driver.findElement(By.xpath("//input[@id='experience_from_date']"));
	from.clear();
	from.sendKeys("2017-03-22");
	WebElement to=
	driver.findElement(By.xpath("//input[@id='experience_to_date']"));
	to.clear();
	to.sendKeys("2017-12-19");
	//yyyy-mm-dd
	driver.findElement(By.xpath("//textarea[@id='experience_comments']")).sendKeys("Testing..");
	//driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
   }
}



