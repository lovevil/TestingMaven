package com.shubham.TestingMaven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerSingle implements IRetryAnalyzer {

	private static final int maxretrycount = 3;
	private int retrycount=0;


	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}



}
