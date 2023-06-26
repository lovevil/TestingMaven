package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDemo {


	@Test
	public void submitDetails() {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	   driver.findElement(By.id("email")).sendKeys("shubham@gmail.com");

	   driver.findElement(By.id("pass")).sendKeys("1234567890");

	   driver.findElement(By.xpath("//button[text()='Log in']")).click();


	   driver.getTitle();

	}







}
