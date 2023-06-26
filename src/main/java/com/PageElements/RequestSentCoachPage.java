package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class RequestSentCoachPage extends ActionClass {

	WebDriver driver;
	Actions action;

	public RequestSentCoachPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath = "//button[text()='Logout']")
	private WebElement  continuebutton;

	public void logout() {

		continuebutton.click();

	}

	public void refreshScreen() {
		driver.navigate().refresh();

	}





}
