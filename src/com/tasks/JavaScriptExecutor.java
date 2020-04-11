package com.tasks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//I have a button but i am not able click on it using WebDriver suggest me some other solution you have
public class JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='p@fbuserid';");
		js.executeScript("document.getElementById('pass').value='p@sswOrd';");
		js.executeScript("document.getElementById('u_0_7').click();");
	}
}
