package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomDropDown {

	@Test
	public void customDropDown() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//div[@class='bgGradient webpSupport landingPageBg']")).click();


		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("los angeles");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

//		System.out.println(driver.findElement(By.id("fromCity")).getAttribute("value"));

		String value = driver.findElement(By.id("fromCity")).getAttribute("value");

		if(value.equalsIgnoreCase("melbourne"))
		{
			System.out.println("Test case passed");

		}

		else {
			System.out.println("Test case Failed");

		}

		driver.quit();


	}

}
