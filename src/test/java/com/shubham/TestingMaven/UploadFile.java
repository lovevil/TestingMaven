package com.shubham.TestingMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	 String imgurl = "/Users/shubhamsaini/Downloads/images/DeeDee.png";


	 @Test
	public void uploadFile() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/seeker/registration");

		WebElement uploadfile = driver.findElement(By.xpath("//input[@id='file-upload']"));

//		uploadfile.click();
		uploadfile.sendKeys(imgurl);

	}

}
