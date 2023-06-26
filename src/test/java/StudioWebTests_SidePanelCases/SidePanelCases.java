package StudioWebTests_SidePanelCases;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageElements.LoginPage;
import com.PageElements.SidePanelElements;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class SidePanelCases extends BaseClass {


	Properties property = ActionClass.readProperty();
	WebDriver driver;
	SidePanelElements sidepanelelements;

	public void loginToWeb() throws InterruptedException {

	    driver = setUp(property.getProperty("browser"), property.getProperty("loginscreenurl"));

		LoginPage loginpage = new LoginPage(driver);

		loginpage.loginWebStudio("pay3@yopmail.com", "subi123456");

	}


	@Test
	public void verifyOngoingActivityScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openOngoingScreen();

		String expectedtext = "Ongoing Classes";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Ongoing Classes\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyScheduleClassScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openScheduleClassScreen();

		String expectedtext = "Schedule a new class | Step 1/2";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Schedule a new class | Step 1/2\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyUpcomingClassScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openUpcomingClassScreen();

		String expectedtext = "Upcoming Classes";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Upcoming Classes\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyClassSummaryScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openClassSummaryScreen();

		String expectedtext = "Class Summary";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Class Summary\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyInvitedMembersScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickMembersTab();

		sidepanelelements.openInvitedMemberScreen();

		String expectedtext = "Invited Member";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Invited Member\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyActiveMembersScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickMembersTab();

		sidepanelelements.openActiveMemberScreen();

		String expectedtext = "Active Members";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Active Members\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyPendingMembersScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickMembersTab();

		sidepanelelements.openPendingMemberScreen();

		String expectedtext = "Pending Requests";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Pending Requests\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyInactiveMembersScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickMembersTab();

		sidepanelelements.openInActiveMemberScreen();

		String expectedtext = "Inactive Members";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Inactive Members\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyRejectedMembersScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickMembersTab();

		sidepanelelements.openRejectedMemberScreen();

		String expectedtext = "Rejected Members";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Rejected Members\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyActiveCoachesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickCoachesTab();

		sidepanelelements.openActiveCoachesScreen();

		String expectedtext = "Active Coaches";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Active Coaches\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyPendingCoachesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickCoachesTab();

		sidepanelelements.openPendingCoachesScreen();

		String expectedtext = "Pending Requests";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Pending Requests\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyInActiveCoachesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickCoachesTab();

		sidepanelelements.openInActiveCoachesScreen();

		String expectedtext = "Inactive Coaches";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Inactive Coaches\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyRejectedCoachesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickCoachesTab();

		sidepanelelements.openRejectedCoachesScreen();

		String expectedtext = "Rejected Coaches";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Rejected Coaches\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyStudioScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openStudioScreen();

		String expectedtext = "Owners";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Owners\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


	@Test
	public void verifyOnDemandClasesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickVideoLibraryTab();

		sidepanelelements.openOnDemandClassesScreen();

		String expectedtext = "Manually uploaded videos";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Manually uploaded videos\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyRecordedLiveClassesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickVideoLibraryTab();

		sidepanelelements.openRecordedLiveClassesScreen();

		String expectedtext = "Recorded Live Classes";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Recorded Live Classes\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyMediaAssetScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickVideoLibraryTab();

		sidepanelelements.openMediaSAssetScreen();

		String expectedtext = "Media Assets";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Media Assets\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyTemplatesScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickTemplateTab();

		sidepanelelements.openTemplateListScreen();

		String expectedtext = "Class Template List";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Class Template List\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyIntegrationsScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openIntegrationsScreen();

		String expectedtext = "Integrations";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Integrations\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyPaymentsScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.openPaymentsScreen();

		String expectedtext = "Subscription";

		WebElement element = driver.findElement(By.xpath("//*[text()=\"Subscription\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyRoomsScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickSettingsTab();

		sidepanelelements.openRoomsScreen();

		String expectedtext = "Rooms";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Rooms\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}

	@Test
	public void verifyLocationScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickSettingsTab();

		sidepanelelements.openLocationScreen();

		String expectedurl = "https://dev-studio.tribe.fitness/location";

		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals( actualurl, expectedurl);

	}


	@Test
	public void verifyDeleteAccountScreen() throws InterruptedException {

		//for login to studio panel
		loginToWeb();

		sidepanelelements = new SidePanelElements(driver);

		sidepanelelements.clickSettingsTab();

		sidepanelelements.openDeleteAccountScreen();

		String expectedtext = "Delete Account";

		WebElement element = driver.findElement(By.xpath("//span[text()=\"Delete Account\"]"));

		String actualtext = element.getText();

		Assert.assertEquals(expectedtext, actualtext);

	}


}
