package com.shubham.TestingMaven;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {

	@Test(enabled=false)
	public void test1() {
		System.out.println("incomplete testcase");
	}

	@Test
	public void test2() {
		System.out.println("skipping test without condition");
		throw new SkipException("skip exception without condition text");
	}

	@Test
	public void test3() {

		boolean work = false;

	   if(work) {

	    System.out.println("people are working");

		}
	   else {

		   throw new SkipException("skip exception with condition text");
     }
	}

	@Test
	public void test4() {
		System.out.println("complete test");
	}

}
