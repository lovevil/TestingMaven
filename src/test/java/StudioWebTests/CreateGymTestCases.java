package StudioWebTests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageElements.ProfilePage;
import com.PageElements.RegisterGymPage;
import com.PageElements.SignUpPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class CreateGymTestCases extends BaseClass {

	Properties property = ActionClass.readProperty();
	WebDriver driver = setUp(property.getProperty("browser"), property.getProperty("signupscreenurl"));

	@Test
	public void CreateGymAsOwner() throws InterruptedException {

		SignUpPage signup = new SignUpPage(driver);
		signup.createAccount("owner29@yopm.com", "1234567890");

		ProfilePage profile = new ProfilePage(driver);
		profile.signUpAsOwnerOnly("Owner1", "auto");

		RegisterGymPage registergym = new RegisterGymPage(driver);
		registergym.enterGymDetailsAndContinue("autogym");

		String expectedurl = "https://dev-studio.tribe.fitness/classSummary";

		Thread.sleep(4000);

        Assert.assertEquals(driver.getCurrentUrl(), expectedurl);

	}

}
