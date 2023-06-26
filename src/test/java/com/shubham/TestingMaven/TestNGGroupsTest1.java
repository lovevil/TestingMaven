package com.shubham.TestingMaven;

import org.testng.annotations.Test;


public class TestNGGroupsTest1 extends BeforeClassAndBeforeGroups {


	@Override
	@Test(groups="sanity")
	public void sanityTest1() {
		System.out.println("This is sanity test1 child class");
	}

	@Override
	@Test(groups="sanity")
	public void sanityTest2() {
		System.out.println("This is sanity test2 child class");
	}

	@Override
	@Test(groups={"sanity","regression"})
	public void sanityAndRegressionTest() {
		System.out.println("This is sanity and regression test child class");
	}

	@Override
	@Test(groups="regression")
	public void regressionTest1() {
		System.out.println("This is regression test1 child class");
	}

	@Override
	@Test(groups="regression")
	public void regressionTest2() {
		System.out.println("This is regression test2 child class");
	}

}
