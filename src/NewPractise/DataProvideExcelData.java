package NewPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvideExcelData {

	@Test
	
	public void yahooTest(String emailId) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		
	driver.findElement(By.xpath("//input[@id='login-username']")).clear();
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
	driver.findElement(By.xpath("//input[@name='signin']")).click();	
	
	Thread.sleep(3000);
	driver.close();
		
	}
	
}
