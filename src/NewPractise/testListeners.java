package NewPractise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testListeners implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Testcase got Finished- onFinish, Deatils : "+arg0.getName()+" "+arg0.getSuite());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
	
		System.out.println("Testcase got started- onStart, Deatils : "+arg0.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		System.out.println("Testcase failedbut --- onTestFailedButWithinSuccessPercentage, Deatils : "+arg0.getName());
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("Testcase got failed- onTestFailure, Deatils : "+arg0.getName()+" "+arg0.getTestName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Testcase got skipped- onTestSkipped, Deatils : "+arg0.getName()+arg0.getName()+" "+arg0.getTestName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Testcase got started- onTestStart, Deatils : "+arg0.getName()+arg0.getName()+" "+arg0.getTestName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Testcase got success- onTestSuccess, Deatils : "+arg0.getName()+arg0.getName()+" "+arg0.getTestName());
		
	}

	

	}


