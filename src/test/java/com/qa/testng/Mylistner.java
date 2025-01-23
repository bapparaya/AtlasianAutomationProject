package com.qa.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistner implements ITestListener {
	
	public void onStart(ITestContext context) {
	    System.out.println("onstart");
	  }
	public void onTestStart(ITestResult result) {
	    System.out.println("onTestStart");
	  }
	
	public void onTestSuccess(ITestResult result) {
		  System.out.println("onTestSuccess");
		  }
	 
	public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure");
		  }
	public void onTestSkipped(ITestResult result) {
		 System.out.println("onTestSkipped");
		  }
	public void onFinish(ITestContext context) {
		 System.out.println("onFinish");
		  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onFinish");
	  }

	  
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    System.out.println("onFinish");
	  }



}
