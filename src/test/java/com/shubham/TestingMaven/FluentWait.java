package com.shubham.TestingMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	@Test
	public void keyboardTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement electronicstab = driver
				.findElement(By.xpath("//ul[@class='hl-cat-nav__container']//following::a[text()='Electronics'][1]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(electronicstab).perform();

		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Apple']"))))
				.click();

		driver.quit();

	}

}
