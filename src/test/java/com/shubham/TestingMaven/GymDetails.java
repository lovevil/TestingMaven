package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GymDetails {

	@Test
	public void keyboardTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev-studio.tribe.fitness/SignUpSteps/gymDetail");
		driver.manage().window().maximize();

		WebElement uploadgymlogo = driver.findElement(By.xpath("//input[@type='file']"));

		WebElement gymnamefield = driver.findElement(By.xpath("//input[@type='text']"));

		WebElement backicon = driver
				.findElement(By.xpath("//*[local-name()='svg' and @data-icon='arrow-circle-left']"));

		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));

		String imgurl = "/Users/shubhamsaini/Downloads/images/DeeDee.png";

		gymnamefield.sendKeys("testgym");
		uploadgymlogo.sendKeys(imgurl);
		continuebutton.click();

		driver.quit();

	}

}
