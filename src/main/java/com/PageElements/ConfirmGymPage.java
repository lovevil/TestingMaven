package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class ConfirmGymPage extends ActionClass {

	WebDriver driver;
	Actions action;

	public ConfirmGymPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='arrow-circle-left']")
	private WebElement  backicon;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement  continuebutton;

	public void goBackToMCodeScreen() {
		action = new Actions(driver);
		action.moveToElement(backicon).click().perform();

	}

	public void confirmGymAndContinue(String mcode) {

		continuebutton.click();

	}






}
