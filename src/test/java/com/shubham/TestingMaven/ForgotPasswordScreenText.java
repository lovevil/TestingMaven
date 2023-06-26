package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPasswordScreenText {

	String imgurl = "/Users/shubhamsaini/Downloads/images/DeeDee.png";

	@Test
	public void getText() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-studio.tribe.fitness/Login");

		driver.findElement(By.xpath("//p[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hell@gmail.copd");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(3000);

//		WebElement text = driver.findElement(By.xpath("//p[@class='forgotSubTitle1'][1]//following::text()[1]"));

		WebElement ele =  driver.findElement(By.xpath("//p[@class='forgotTitle1']//following::p[2]"));

//		String txt = text.getText();

		System.out.println(ele.getText());

		driver.quit();

	}

}
