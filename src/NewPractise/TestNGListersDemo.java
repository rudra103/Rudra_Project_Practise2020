package NewPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Class Level
//@Listeners(NewPractise.testListeners.class)
public class TestNGListersDemo {
 @Test(priority=1)
    public void verifyGoogleTitlePass() throws Exception{
		WebDriver driver =new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.co.in/");
    	System.out.println(driver.getTitle());
    	driver.close();
	}
 
 @Test(priority=2)
 public void verifyGoogleTitleFail() throws Exception{
	System.out.println("Google Verify Title failed--");
 	Assert.assertTrue(false);
	}
}
