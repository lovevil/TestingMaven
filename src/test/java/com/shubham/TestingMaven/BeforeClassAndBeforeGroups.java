package com.shubham.TestingMaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeClassAndBeforeGroups  {

	@BeforeSuite
	public void beforeSuites() {
		System.out.println("This will execute before suite2");
	}

	@AfterSuite
	public void afterSuites() {
		System.out.println("This will execute after suite2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("it will execute before all of the tests in class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("it will execute after all of the tests in class");
	}

	@BeforeGroups(value="regression")
	public void beforeGroups() {
		System.out.println("it will execute before all of the tests under groups");
	}

	@AfterGroups(value="regression")
	public void afterGroups() {
		System.out.println("it will execute after all of the tests under groups");
	}


	@Test(groups="sanity")
	public void sanityTest1() {
		System.out.println("This is sanity test1 base class");
	}

	@Test(groups="sanity")
	public void sanityTest2() {
		System.out.println("This is sanity test2 base class");
	}

	@Test(groups={"sanity","regression"})
	public void sanityAndRegressionTest() {
		System.out.println("This is sanity and regression test base class");
	}

	@Test(groups="regression")
	public void regressionTest1() {
		System.out.println("This is regression test1 base class");
	}

	@Test(groups="regression")
	public void regressionTest2() {
		System.out.println("This is regression test2 base class");
	}

	@Test(groups="functional")
	public void functionalTest() {
		System.out.println("This is functional test base class");
	}

}
