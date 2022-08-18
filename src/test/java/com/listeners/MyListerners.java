package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println( " onTestStart ");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println(" onTestSuccess ");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println( " onTestFailure  " +result);
		// screenshot-- 
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println(" onTestSkipped " +result);
		// Excel 
		// 
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println(" onStart ");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println(" onFinish ");
		
	}

}
