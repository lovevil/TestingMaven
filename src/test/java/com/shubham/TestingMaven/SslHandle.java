package com.shubham.TestingMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslHandle {





	@Test
	public void handleBadSsl() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		DesiredCapabilities cap = new DesiredCapabilities();


		//first way
//		cap.setAcceptInsecureCerts(true);

		//second way
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
//		options.setHeadless(true);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.quit();

	}

}
