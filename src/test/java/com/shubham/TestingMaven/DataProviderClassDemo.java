package com.shubham.TestingMaven;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DataProviderClassDemo {

	@Test(dataProvider="dp1",dataProviderClass = DataProviderTest.class)
	public void test1(String val1, String val2) {

		System.out.println("using first data provider");
		System.out.println(val1 +  "  ========  " + val2);
	}

	@Test(dataProvider="dp1",dataProviderClass = DataProviderTest.class)
	public void test2(String val1, String val2) {

		System.out.println("using first data provider");
		System.out.println(val1 +  "  ========  " + val2);
	}

	@Test(dataProvider="dp1",dataProviderClass = DataProviderTest.class)
	public void test3(String val1, String val2,String val3) {

		System.out.println("using first data provider");
		System.out.println(val1 +  "  ========  " + val2 + "  =====   " + val3);

		Assert.assertTrue(false);
	}

}
