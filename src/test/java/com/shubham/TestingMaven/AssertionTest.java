package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {

	@Test
	public void checkTitleAndText() {

		SoftAssert sa = new SoftAssert();

		String expectedtitle = "Google";

		String expectedtext = "I'm Feeling Lucky";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		String actualtitle = driver.getTitle();

		String actualtext = driver.findElement(By.name("btnI")).getAttribute("value");

		AssertJUnit.assertEquals(actualtitle, expectedtitle , "title not matched");

		AssertJUnit.assertEquals(actualtext, expectedtext , "text not matched");

		driver.quit();

		System.out.println("driver session is closed now");

		sa.assertAll();

	}

}
