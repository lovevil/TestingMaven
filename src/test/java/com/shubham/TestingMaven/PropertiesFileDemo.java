package com.shubham.TestingMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileDemo {

	File filename = new File("/Users/shubhamsaini/eclipse-workspace/TestingMaven/resources/data.properties");

	@Test
	public void submitDetails() throws IOException, InterruptedException {



		//To read property from properties file
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream(filename);
		property.load(fis);

		//for writing data in properties file
		FileOutputStream fos = new FileOutputStream(filename);
		property.setProperty("browser", "chrome");
		property.store(fos, null);


		String uname = property.getProperty("username");
		String passwd = property.getProperty("password");
		String url = property.getProperty("url");


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

	   driver.findElement(By.id("email")).sendKeys(uname);

	   Thread.sleep(2000);

	   driver.findElement(By.id("pass")).sendKeys(passwd);

	   driver.findElement(By.xpath("//button[text()='Log in']")).click();

	   driver.quit();

	}
}
