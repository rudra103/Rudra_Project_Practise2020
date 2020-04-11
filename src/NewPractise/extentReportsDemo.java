package NewPractise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsDemo {

	@Test
	public void testSample(){

//./ExtentReportsVer3/extreports.html-refers to current directory
		System.out.println("Logged into AMAZON.com");
		ExtentHtmlReporter report=new ExtentHtmlReporter("C://Users//user//Desktop//New folder//Rudra_Project//test-output//extentReports//extentSample1.html");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest logger=extent.createTest("extentReportsDemo");
		
		logger.log(Status.INFO, "Logged into AMAZOn.commmm");
		logger.log(Status.PASS, "Login to Homapage test passed");
		
		
		extent.flush();
	}

}
