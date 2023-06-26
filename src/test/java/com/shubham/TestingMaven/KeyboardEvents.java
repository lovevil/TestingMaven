package com.shubham.TestingMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	@Test
	public void keyboardTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		driver.findElement(By.name("text1")).sendKeys(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		WebElement firstfield = driver.findElement(By.name("text1"));

		WebElement secondfield = driver.findElement(By.name("text2"));

		Actions action = new Actions(driver);

		action.keyDown(firstfield, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		Thread.sleep(1000);

		action.keyDown(secondfield, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

		Thread.sleep(3000);

		driver.quit();

	}

}
