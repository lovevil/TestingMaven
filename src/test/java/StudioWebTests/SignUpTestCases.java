package StudioWebTests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageElements.ProfilePage;
import com.PageElements.SignUpPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class SignUpTestCases extends BaseClass {

	Properties property = ActionClass.readProperty();
	WebDriver driver = setUp(property.getProperty("browser"), property.getProperty("signupscreenurl"));
	SignUpPage signuppageobj = new SignUpPage(driver);
	ProfilePage profilepageobj = new ProfilePage(driver);


	@Test
	public void signUp() throws InterruptedException {

		signuppageobj.createAccount("test4@yopmai.com", "subi123456");
		Thread.sleep(3000);
		profilepageobj.signUpAsCoachOnly("test", "auto");
		Thread.sleep(2000);



	}


}
