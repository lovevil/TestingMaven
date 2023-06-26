package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {


	public static void dragAndDrop(WebElement source , WebElement destination , Actions action) {

//		action.dragAndDrop(source, destination).build().perform();

		action.clickAndHold(source).moveToElement(destination).build().perform();

		}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']"));

		WebElement destination = driver.findElement(By.xpath("//*[@class='placeholder'][1]"));

		dragAndDrop(source, destination , action);

		driver.quit();
	}

}
