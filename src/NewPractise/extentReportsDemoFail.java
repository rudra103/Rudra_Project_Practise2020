package NewPractise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class extentReportsDemoFail {

	WebDriver driver;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest logger;
  
	@BeforeMethod
	public void bm(){
         System.out.println("Before Method...");
    	
    	htmlReporter=new ExtentHtmlReporter("./test-output/extentReports/sampleHTMLreport.html");
    	extent=new ExtentReports();
    	extent.attachReporter(htmlReporter);
    	logger=extent.createTest("extentReportsDemoFail");
		logger.info("Test Started...");
		System.setProperty("webdriver.chrome.driver", 
	               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
        driver=new ChromeDriver();
        logger.log(Status.INFO, "Chrome browser Launched...");
		driver.get("https://www.google.com/");
		logger.pass("Navigated to Google page..");
		driver.manage().window().maximize();
		System.out.println("Before method...");
	}
	
	@Test
	public void verifyTestGoogle() throws Exception{
	
		String title=driver.getTitle();
		logger.pass("Google Title got captured..");
		Assert.assertTrue(title.equalsIgnoreCase("Google"));
		logger.pass("Title Verified..");
		System.out.println("Google Title Verified..");
}
	
	
	
	@AfterMethod
	public void am(){
		System.out.println("After method...");
		extent.flush();
		driver.close();
		logger.log(Status.INFO, "Chrome browser Closed...");
	}

}
