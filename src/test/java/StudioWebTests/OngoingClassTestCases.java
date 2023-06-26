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

import com.PageElements.LoginPage;
import com.PageElements.OngoingClassPage;
import com.PageElements.SidePanelElements;
import com.PageElements.UpcomingClassPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class OngoingClassTestCases extends BaseClass {

	Properties property = ActionClass.readProperty();
	WebDriver driver;
	UpcomingClassPage upcomingclasspage;
	SidePanelElements sidepanelelements;
	Actions actions;

	public void loginToWeb() throws InterruptedException {

		driver = setUp(property.getProperty("browser"), property.getProperty("loginscreenurl"));

		LoginPage loginpage = new LoginPage(driver);

		loginpage.loginWebStudio("pay3@yopmail.com", "subi123456");

	}

	@Test
	public void copyClassInvite() throws InterruptedException, UnsupportedFlavorException, IOException {

		loginToWeb();

		OngoingClassPage ongoingclasspage = new OngoingClassPage(driver);

		SidePanelElements sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openOngoingScreen();

		boolean isPresent = driver.findElements(By.xpath("//div[@class=\"schedule_action flexG\"]//span[2]"))
				.size() > 0;

		if (isPresent) {

			ongoingclasspage.copyClassInvite();

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			String actualCopiedText = (String) clipboard.getData(DataFlavor.stringFlavor);
			System.out.println(actualCopiedText);

		}

		else {

			Assert.fail("No Ongoing Classes Available");
		}

	}
	
	@Test
	public void copyClassLink() throws InterruptedException, UnsupportedFlavorException, IOException {

		loginToWeb();

		OngoingClassPage ongoingclasspage = new OngoingClassPage(driver);

		SidePanelElements sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openOngoingScreen();

		boolean isPresent = driver.findElements(By.xpath("//div[@class=\"schedule_action flexG\"]//span[2]"))
				.size() > 0;

		if (isPresent) {

			ongoingclasspage.copyClassLink();

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			String actualCopiedText = (String) clipboard.getData(DataFlavor.stringFlavor);
			System.out.println(actualCopiedText);

		}

		else {

			Assert.fail("No Ongoing Classes Available");
		}

	}

	@Test
	public void clickJoinClassIcon() throws InterruptedException, UnsupportedFlavorException, IOException {

		loginToWeb();

		OngoingClassPage ongoingclasspage = new OngoingClassPage(driver);

		SidePanelElements sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openOngoingScreen();

		boolean isPresent = driver.findElements(By.xpath("//div[@class=\"schedule_action flexG\"]//span[2]"))
				.size() > 0;

		if (isPresent) {

			ongoingclasspage.joinClass();
			
			String ExpectedURL = "https://thebeat.tribe.fitness/LiveActivity";
			
			String ActualURL = driver.getCurrentUrl();
						
			Assert.assertEquals(ActualURL, ExpectedURL,"class not joined.");
			
			System.out.println("class joined successfully.");

		}

		else {

			Assert.fail("No Ongoing Classes Available");
		}

	}

}