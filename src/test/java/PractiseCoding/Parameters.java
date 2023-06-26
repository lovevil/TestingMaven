package PractiseCoding;

import org.testng.annotations.Test;

public class Parameters {


	@org.testng.annotations.Parameters(value="first")

	@Test
	public void test1(String value) {
		System.out.println(value);
	}

	@org.testng.annotations.Parameters(value="second")
	@Test
	public void test2(String value) {
		System.out.println(value);
	}

	@org.testng.annotations.Parameters(value="third")
	@Test
	public void test3(String value) {
		System.out.println(value);
	}

	@org.testng.annotations.Parameters(value="fourth")
	@Test
	public void test4(String value) {
		System.out.println(value);
	}
}
