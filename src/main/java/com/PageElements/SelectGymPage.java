package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class SelectGymPage extends ActionClass {

	WebDriver driver;
	Actions action;

	public SelectGymPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement  membershipcodefield;

	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='arrow-circle-left']")
	private WebElement  backicon;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement  continuebutton;

	public void goBackToProfileScreen() {
		action = new Actions(driver);
		action.moveToElement(backicon).click().perform();

	}

	public void enterMembershipCodeAndContinue(String mcode) {

		membershipcodefield.sendKeys(mcode.toUpperCase());
		continuebutton.click();

	}






}
