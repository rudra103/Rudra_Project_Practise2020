package NewPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.LongSerializationPolicy;

public class extentReportScreenshotCaptue {
    WebDriver driver;
	ExtentHtmlReporter report;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUp(){
		
		report=new ExtentHtmlReporter("C://Users//user//Desktop//New folder//Rudra_Project//test-output//extentReports//extentSampleScreenshot3.html");
		extent=new ExtentReports();
		extent.attachReporter(report);
		logger=extent.createTest("extentReportScreenshotCaptue");
		
	}
	@Test
	public void testSample() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
	               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		Assert.assertTrue(title.equalsIgnoreCase("Google"));
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception{
          if(result.getStatus()==ITestResult.FAILURE){
        	logger.log(Status.FAIL,"Failed test"+result.getName());
        	String path=utilityScreenshot.getScreenshot(driver);
        	logger.log(Status.FAIL, (Markup) logger.addScreenCaptureFromPath(path));
        	
        	  /*   String path=utilityScreenshot.getScreenshot(driver);
        	 
        	   Thread.sleep(2000);
        	   logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
        	*/ 
          
          }
          driver.close();
          extent.flush();
	}
}

