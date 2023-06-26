package StudioWebTests;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageElements.ForgotPassword;

import BaseClassContainer.BaseClass;
import Utilities.ActionClass;

public class ForgotPasswordTestCases extends BaseClass {

	Properties property = ActionClass.readProperty();
	WebDriver driver = setUp(property.getProperty("browser"), property.getProperty("forgotpasswordscreenurl"));

	ForgotPassword obj = new ForgotPassword(driver);

	@Test
	public void ForgotPasswordTest() throws InterruptedException, IOException {

		obj.forgotPassword("test@yopmail.com");

		Thread.sleep(3000);

	}

	@Test
	public void checkBackToLoginFeatureTest() {

		obj.goBackToLoginScreen();

		String expectedurl = "https://dev-studio.tribe.fitness/Login";

		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(expectedurl, actualurl);

	}

	@Test
	public void reEnterEmailTest() {

		obj.reEnterEmail("test1@yopmail.com", "test2@yopmail.com");

		String text = driver.findElement(By.xpath("//p[@class='forgotTitle1']//following::p[2]")).getText().toString();

		Assert.assertTrue(text.contains("test2@yopmail.com"));

	}

	@Test
	public void reSendEmail() throws InterruptedException {
		obj.forgotPassword("test@yopmail.com");
		Thread.sleep(2000);
		obj.reSendEmail();
		Thread.sleep(2000);
	}

}
