package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class SignUpPage extends ActionClass {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement emailfield;

	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordfield;

	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement signinlink;

	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement createaccountbutton;

	public void goToLoginScreen() {

		signinlink.click();
	}

	public void createAccount(String email, String password) {

		emailfield.sendKeys(email);

		passwordfield.sendKeys(password);

		createaccountbutton.click();

	}

}
