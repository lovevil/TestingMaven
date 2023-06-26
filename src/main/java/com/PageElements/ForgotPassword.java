package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class ForgotPassword extends ActionClass {

	WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='formInput']")
	private WebElement emailfield;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitbutton;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginlink;

	@FindBy(xpath = "//span[text()=' Re-enter']")
	private WebElement re_enteremaillink;

	@FindBy(xpath = "//span[text()=' Re-send now']")
	private WebElement re_sendemaillink;

	public void goBackToLoginScreen() {

		loginlink.click();

	}

	public void forgotPassword(String email) {

		emailfield.sendKeys(email);
		submitbutton.click();
	}

	public void reEnterEmail(String firstemail,String secondemail) {

		forgotPassword(firstemail);
		re_enteremaillink.click();
		forgotPassword(secondemail);


	}

	public void reSendEmail() {

		re_sendemaillink.click();
	}

}
