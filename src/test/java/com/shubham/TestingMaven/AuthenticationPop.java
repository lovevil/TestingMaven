package com.shubham.TestingMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPop {

	String username = "admin";
	String password = "admin";

	@Test
	public void authenticationPopup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.quit();

	}

}
