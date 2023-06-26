package com.shubham.TestingMaven;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFirstProgram {

	@BeforeTest
	public void beforeAllTests() {
		System.out.println("This line will be shown before executing all tests");
	}

	@AfterTest
	public void afterAllTests() {
		System.out.println("This line will be shown after executing all tests");
	}

	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("This line will be shown before each test");
	}

	@AfterMethod
	public void afterEachMethod() {
		System.out.println("This line will be shown after each test");
	}

	@Test
	public void aatest1() {
		System.out.println("This is test1");
	}


	@Test
	public void atest2() {
		System.out.println("This is test2");
		Assert.assertTrue(false);
	}

	@Test
	public void btest3() {
		System.out.println("This is test3");
		Assert.assertTrue(false);

	}


}
