package StudioWebTests;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageElements.LoginPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;


public class WebStudioLoginTest extends BaseClass{

	WebDriver driver;
	Properties property;


	@Test
	public void loginTest() throws InterruptedException, IOException {

		property = ActionClass.readProperty();

		driver = setUp(property.getProperty("browser"), property.getProperty("loginscreenurl"));

		LoginPage obj = new LoginPage(driver);

//		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);

		obj.loginWebStudio("odowner1@yopmail.com", "subi123456");

		Thread.sleep(3000);

		Assert.assertTrue(false);
	}





}
