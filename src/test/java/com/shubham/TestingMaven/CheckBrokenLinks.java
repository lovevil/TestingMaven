package com.shubham.TestingMaven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBrokenLinks {

	static int oklinks = 0;
	static int brokenlinks = 0;

	public static void checkBrokenLinks(String url) throws IOException {

		URL links = new URL(url);
		HttpURLConnection httpconnection = (HttpURLConnection) links.openConnection();
		httpconnection.setConnectTimeout(5000);
		httpconnection.connect();

		if (httpconnection.getResponseCode() >= 400) {
			System.out.println("Link is broken : " + url + " ---> " + httpconnection.getResponseMessage());
			brokenlinks++;
		} else {
			System.out.println("Link is Ok : " + url + " ---> " + httpconnection.getResponseMessage());
			oklinks++;
		}

	}
	
	

	@Test
	public void getLinks() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		List<WebElement> listelements = driver.findElements(By.tagName("a"));

		List<String> urllist = new ArrayList<>();

		System.out.println("number of links : " + listelements.size());

		for (WebElement e : listelements) {

			String url = e.getAttribute("href");
//			System.out.println(url);
//			checkBrokenLinks(url);
			urllist.add(url);
		}

		urllist.parallelStream().forEach(e -> {
			try {
				checkBrokenLinks(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		System.out.println("ok links are : " + oklinks);

		System.out.println("broken links are : " + brokenlinks);


		driver.quit();

	}

	
	
	
	
	
	
}
