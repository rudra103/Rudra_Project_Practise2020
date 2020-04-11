package NewPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngSample2 {

	    WebDriver driver;
	  	   
	    @BeforeMethod
	    public void beforeMethod(){
			
	    	driver =new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://www.google.co.in/");
		}
	   
		@Test(priority=1)
		public void testMethod(){
			
			String title =driver.getTitle();
			System.out.println(title);
			//System.out.println("TestCase-1 passed");
			Assert.assertEquals(title, "Google123","Title mismatched...");
		}

		@Test(priority=2)
		public void testmethod2(){
			boolean b=driver.findElement(By.xpath("//--img[@alt='Google']")).isDisplayed();
			System.out.println("Google image is Displayed :"+b);
			//System.out.println("TestCase-2 passed");
			Assert.assertTrue(b);
		}
		
		@AfterMethod
	    public void afterMethod() throws InterruptedException{
			driver.close();
			Thread.sleep(3000);
		}
	
}
