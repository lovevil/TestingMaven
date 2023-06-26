package com.shubham.TestingMaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void cssChildTest() {
	   driver.get("https://www.telerik.com/download");
       System.out.println("first child text : " + driver.findElement(By.cssSelector("div#ContentPlaceholder1_C326_Col01>:first-child")).getText());
       System.out.println("last child text : " + driver.findElement(By.cssSelector("div#ContentPlaceholder1_C326_Col01>:last-child")).getText());
       System.out.println("nth child text : " + driver.findElement(By.cssSelector("div#ContentPlaceholder1_C326_Col01>:nth-child(2)")).getText());


	}

	@Test
	public void cssChildOrSubChild() {
		driver.get("https://www.telerik.com/download");
        List <WebElement> list =  driver.findElements(By.cssSelector("div#ContentPlaceholder1_C323_Col00>div"));
   	 System.out.println(list.size());

         for(WebElement el:list) {
        	 System.out.println(el.getText());
         }

	}

	@Test
	public void cssNthOfTypeTest() {
		driver.get("https://www.telerik.com/download");
       System.out.println("first child text : " + driver.findElement(By.cssSelector("div#ContentPlaceholder1_C326_Col01 p:nth-of-type(2)")).getText());



	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}


}
