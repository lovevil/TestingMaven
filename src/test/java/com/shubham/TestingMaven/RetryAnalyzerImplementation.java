package com.shubham.TestingMaven;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerImplementation {

	@Test
	public void test1() {
		System.out.println("this is test1");
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		System.out.println("this is test3");
	}

	@Test
	public void test4() {
		System.out.println("this is test4");
	}

}
