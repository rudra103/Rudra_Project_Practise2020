package NewPractise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeWebdriver {

	public static void main(String[] args) throws Exception {

	   System.setProperty("webdriver.chrome.driver", 
			               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
         Properties prop=new Properties();
         FileInputStream fip=new FileInputStream("C:/Users/user/git/PractiseRepository/Rudra_Project/src/NewPractise/config.properties");
         prop.load(fip);
        
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
