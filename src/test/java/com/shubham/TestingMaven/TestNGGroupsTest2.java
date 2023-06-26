package com.shubham.TestingMaven;

import org.testng.annotations.Test;


public class TestNGGroupsTest2 {


	@Test(groups="sanity")
	public void sanityTest1() {
		System.out.println("This is sanity test1");
	}

	@Test(groups="functional")
	public void functionalTest1() {
		System.out.println("This is functional Test1");

	}

	@Test(groups="functional")
	public void functionalTest2() {
		System.out.println("This is functional Test2");
	}

	@Test(groups={"sanity","regression","functional"})
	public void sanity_RegressionAndFunctionalTest() {
		System.out.println("This is sanity ,regression and functional test");
	}

	@Test(groups={"regression","functional"})
	public void regressionAndFunctionalTest1() {
		System.out.println("This is regression and functional test");
	}

	@Test(groups="sanity")
	public void sanityTest2() {
		System.out.println("This is sanity test2");
		assert false;

	}

}
