package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {


	@Test
	public void sliderTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);

		WebElement slider = driver.findElement(By.xpath("//span[@tabindex='0']"));

		Actions action = new Actions(driver);

		Thread.sleep(2000);

		action.dragAndDropBy(slider, 300, 25).perform();




	}


}
