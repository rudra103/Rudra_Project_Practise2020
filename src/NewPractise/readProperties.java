package NewPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readProperties {

	public static void main(String[] args) throws InterruptedException, IOException {
			
		 Properties prop=new Properties();
		 FileInputStream ip=new FileInputStream("C:/Users/user/git/PractiseRepository/Rudra_Project/src/NewPractise/config.properties");
		 prop.load(ip);
		 System.out.println(prop.getProperty("browser"));
		 
		 WebDriver driver=new FirefoxDriver();
		 driver.get(prop.getProperty("url"));
		 
		 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(prop.getProperty("emailId"));
		 driver.findElement(By.xpath("//input[@name='signin']")).click();
	     Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='pure-button puree-button-primary puree-spinner-button try-again']")).click();
		 
		 Thread.sleep(4000);
		 driver.close();
		 System.out.println("Browser got closed..");
		 
		
	}
}
