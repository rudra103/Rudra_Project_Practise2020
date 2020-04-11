package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		
	}

	@Override
	public void onStart(ITestContext result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase Failed : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase Skipped : "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase Started : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Success : "+result.getName());
	}

}
