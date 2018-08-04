package com.reports;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utility.TakeScreenShot;


public class ListenersTestNG extends TakeScreenShot implements ITestListener {

	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//System.out.println("Test Passed in Listeners");
		
		//takeScreenShot(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This Test has been failed and catched by Listener");
//    	takeScreenShot(result.getMethod().getMethodName());
		takeScreenShot();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
