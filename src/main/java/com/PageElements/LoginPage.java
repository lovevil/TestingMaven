package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;


public class LoginPage extends ActionClass  {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement emailfield;

	@FindBy(xpath="//input[@type=\"password\"]")
	@CacheLookup
	private WebElement passwordfield;

	@FindBy(how=How.XPATH,using="//button[text()=\"Log in\"]")
	private WebElement loginbutton;

	@FindBy(xpath="//span[text()='Sign Up']")
	@CacheLookup
	private WebElement signuplink;

	@FindBy(xpath="//p[text()='Forgot your password?']")
	@CacheLookup
	private WebElement forgotpasswordlink;



	public void loginWebStudio(String username,String password) {

		emailfield.sendKeys(username);

		passwordfield.sendKeys(password);

		loginbutton.click();

	}

	public void clickSignUpLink() {
		signuplink.click();
	}

	public void clickForgotPasswordLink() {
		forgotpasswordlink.click();
	}















}
