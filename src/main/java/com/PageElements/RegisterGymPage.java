package com.PageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ActionClass;

public class RegisterGymPage extends ActionClass {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;

	public RegisterGymPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadgymlogo;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement gymnamefield;

	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='arrow-circle-left']")
	private WebElement backicon;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement continuebutton;

	private String imgurl = "/Users/shubhamsaini/Downloads/images/DeeDee.png";


	public void goBackToProfileScreen() {

		backicon.click();

	}

	public void enterGymDetailsAndContinue(String gymname) throws InterruptedException {

		Thread.sleep(1500);

		uploadgymlogo.sendKeys(imgurl);
		System.out.println("gym logo uploaded");

		Thread.sleep(1000);

		gymnamefield.sendKeys(gymname);
		System.out.println("gym name filled");

//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@type='submit']")));
//		continuebutton.click();

		Thread.sleep(1500);

		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", continuebutton);
		executor.executeScript("arguments[0].click();", continuebutton);
//		continuebutton.click();
//
		Thread.sleep(5000);

//		action = new Actions(driver);
//		action.moveToElement(continuebutton).click().perform();
		System.out.println("gym created!");

	}

}
