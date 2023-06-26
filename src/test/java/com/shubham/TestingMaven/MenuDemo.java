package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuDemo {


	@Test
	public void sliderTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/menu/");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);

		WebElement mainitem = driver.findElement(By.xpath("//div[text()='Electronics']"));

		WebElement subitem = driver.findElement(By.xpath("//div[text()='Car Hifi']"));

		Actions action = new Actions(driver);

		action.moveToElement(mainitem).perform();

		Thread.sleep(1000);

		action.moveToElement(subitem).click();

		Thread.sleep(2000);

        driver.quit();






	}


}
