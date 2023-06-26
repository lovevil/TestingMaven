package com.shubham.TestingMaven;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {



	@DataProvider(name="dp1")
    public Object [][] dataProvider1(Method m) {

		Object[][] testdata = null;

		if(m.getName().equals("test1")) {


		testdata =  new Object [][] {
			{"user1","password1"},
			{"user2","password2"},
			{"user3","password3"},
			{"user4","password4"}};
			return testdata;

		}


		else if(m.getName().equals("test2"))
		{
			 testdata = new Object[4][2];

				//for first row
			 testdata[0][0]="user11";
			 testdata[0][1]="password12";

				//for second row
			 testdata[1][0]="user21";
			 testdata[1][1]="password22";

		        //for third row
			 testdata[2][0]="user31";
			 testdata[2][1]="password32";

				//for fourth row
			 testdata[3][0]="user41";
			 testdata[3][1]="password42";

				return testdata;
		}

		else if(m.getName().equals("test3")) {

			testdata =  new Object [][] {
				{"user1","password1","test1"},
				{"user2","password2","test2"},
				{"user3","password3","test3"},
				{"user4","password4","test4"}};

				return testdata;
		}

		else {
			return null;
		}


 }


	@DataProvider(name="dp2")
    public Object [][] dataProvider2() {

		Object[][] data = new Object[4][2];

		//for first row
		data[0][0]="user1";
		data[0][1]="password2";

		//for second row
		data[1][0]="user2";
		data[1][1]="password2";

        //for third row
		data[2][0]="user3";
		data[2][1]="password3";

		//for fourth row
		data[3][0]="user4";
		data[3][1]="password4";

		return data;
	}


	@Test(dataProvider="dp1")
	public void useData1(String val1, String val2) {

		System.out.println("using first data provider");
		System.out.println(val1 +  "  ========  " + val2);
	}

	@Test(dataProvider="dp2")
	public void useData2(String val1, String val2) {

		System.out.println("using second data provider");
		System.out.println(val1 +  "  ========  " + val2);
	}

}
