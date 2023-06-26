package StudioWebTests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageElements.LoginPage;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;
import junit.framework.Assert;

public class CheckSignUpAndForgotPasswordLinks extends BaseClass {

	WebDriver driver;
	Properties property;
	String expectedforgotpasswordpagetext = "Forgot your Password?";
	String expectedsignuppagetext = "Sign up using your Email address";

	@Test
	public void checkForgotPasswordLink() throws IOException {

		property = ActionClass.readProperty();

		driver = setUp(property.getProperty("browser"), property.getProperty("loginscreenurl"));

		LoginPage loginpage = new LoginPage(driver);

		loginpage.clickForgotPasswordLink();

		String actualtext = driver.findElement(By.xpath("//p[text()='Forgot your Password?']")).getText();

		Assert.assertEquals(expectedforgotpasswordpagetext, actualtext);

	}

	@Test
	public void checkSignUpLink() throws IOException {

		property = ActionClass.readProperty();

		driver = setUp(property.getProperty("browser"), property.getProperty("url"));

		LoginPage loginpage = new LoginPage(driver);

		loginpage.clickSignUpLink();

		String actualtext = driver.findElement(By.xpath("//p[text()='Sign up using your Email address']")).getText();

		Assert.assertEquals(expectedsignuppagetext, actualtext);

	}

}
