package StudioWebTests;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageElements.ClassSummaryPage;
import com.PageElements.LoginPage;
import com.PageElements.OngoingClassPage;
import com.PageElements.SidePanelElements;
import com.PageElements.UpcomingClassPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class ClassSummaryTestCases extends BaseClass {

	Properties property = ActionClass.readProperty();
	WebDriver driver;
	SidePanelElements sidepanelelements;
	Actions actions;

	public void loginToWeb() throws InterruptedException {

		driver = setUp(property.getProperty("browser"), property.getProperty("loginscreenurl"));

		LoginPage loginpage = new LoginPage(driver);

		loginpage.loginWebStudio("pay3@yopmail.com", "subi123456");

	}

	@Test
	public void checkClassesAvailable() throws InterruptedException, UnsupportedFlavorException, IOException {

		loginToWeb();

		ClassSummaryPage classsummarypage = new ClassSummaryPage(driver);

		SidePanelElements sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openClassSummaryScreen();

		boolean isPresent = driver.findElements(By.xpath(classsummarypage.xpathclasslist)).size() > 0;

		if (isPresent) {

			Assert.assertTrue(isPresent);

		}

		else {

			Assert.fail("No Classes Available");
		}

	}
	
	
	
	@Test
	public void openClassDetails() throws InterruptedException, UnsupportedFlavorException, IOException {

		String expectedurl = "https://thebeat.tribe.fitness/ActivitySummary";
		
		loginToWeb();

		ClassSummaryPage classsummarypage = new ClassSummaryPage(driver);

		SidePanelElements sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openClassSummaryScreen();

		boolean isPresent = driver.findElements(By.xpath(classsummarypage.xpathclasslist)).size() > 0;

		if (isPresent) {

			driver.findElement(By.xpath(classsummarypage.xpathclassnamelink)).click();
			
			Thread.sleep(1000);
			
			String actualurl =driver.getCurrentUrl();
			
			if(actualurl.contains(expectedurl)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.fail("Activity Summary Screen Not Loaded");
			}

		}

		else {

			Assert.fail("No Classes Available");
		}

	}

}