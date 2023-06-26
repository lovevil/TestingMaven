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
import com.PageElements.SidePanelElements;
import com.PageElements.UpcomingClassPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class UpcomingClassTestCases extends BaseClass {

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
	public void checkClassesAvailable() throws InterruptedException {

		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openUpcomingClassScreen();

		Boolean isPresent = driver.findElements(By.xpath("//div[@class=\"tableRow \"]")).size() > 0;

		if (isPresent) {
			Assert.assertTrue(isPresent, "Class Element Is Available");
		}

		else {
			Assert.fail("No Upcoming Classes Available");

		}

	}

	@Test
	public void openWaitingRoom() throws InterruptedException {

		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openUpcomingClassScreen();

		upcomingclasspage = new UpcomingClassPage(driver);

		boolean isPresent = driver.findElements(By.xpath(upcomingclasspage.waitingroomiconlocator)).size() > 0;

		if (isPresent) {

			upcomingclasspage.openWaitingRoom();

			Thread.sleep(4000);

			String ExpectedURL = "https://dev-studio.tribe.fitness/LiveActivity";

			String ActualURL = driver.getCurrentUrl();

			Assert.assertEquals(ActualURL, ExpectedURL, "No Classes Available");
		}

		else {
			Assert.fail("No Upcoming Classes Available");
		}

	}

	@Test(groups = { "regression" })
	public void clickCopyLinkIcon() throws InterruptedException, UnsupportedFlavorException, IOException {

		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openUpcomingClassScreen();

		upcomingclasspage = new UpcomingClassPage(driver);

		boolean isPresent = driver.findElements(By.xpath("//div[@class=\"schedule_action flexG\"]//span[2]"))
				.size() > 0;

		if (isPresent) {

			upcomingclasspage.copyClassInvite();

//			upcomingclasspage.closeClassLinkPopUp();

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			String actualCopiedText = (String) clipboard.getData(DataFlavor.stringFlavor);
			System.out.println(actualCopiedText);

		}

		else {
			Assert.fail("No Upcoming Classes Available");
		}

	}

	@Test(groups = { "regression", "sanity" })
	public void cancelClass() throws InterruptedException {

		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openUpcomingClassScreen();

		upcomingclasspage = new UpcomingClassPage(driver);

		boolean isPresent = driver.findElements(By.xpath("//div[@class=\"schedule_action flexG\"]//span[2]"))
				.size() > 0;

		if (isPresent) {

			upcomingclasspage.openDetailsDropDown();

			boolean cancelbuttonavailable = driver.findElements(By.xpath("//button[text()=\"Cancel Class\"]"))
					.size() > 0;

			if (cancelbuttonavailable) {

				upcomingclasspage.clickCancelClassButton();
				
				Thread.sleep(2000);

				System.out.println("class canceled");

			}

			else {
				System.out.println("cannot cancel class now!");
			}

		}

		else {
			
			Assert.fail("No Upcoming Classes Available");
		}

	}
	
	
	
	

}