package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class ProfilePage extends ActionClass {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='form_row']//child::div[1]//input")
	private WebElement firstnamefield;

	@FindBy(xpath = "//div[@class='form_row']//child::div[2]//input")
	private WebElement secondnamefield;

	@FindBy(xpath = "//input[@value='COACH']")
	private WebElement coachcheckbox;

	@FindBy(xpath = "//input[@value='GYM_OWNER']")
	private WebElement ownercheckbox;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continuebutton;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadprofilepic;

	private String imgurl = "/Users/shubhamsaini/Downloads/images/DeeDee.png";

	public void signUpAsCoachOnly(String fname, String lname) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[starts-with(text(),'Add')]")))
//				.sendKeys(imgurl);

		uploadprofilepic.sendKeys(imgurl);
		firstnamefield.sendKeys(fname);
		secondnamefield.sendKeys(lname);
		coachcheckbox.click();
		continuebutton.click();
		System.out.println("profile info filled");
		Thread.sleep(4000);


	}

	public void signUpAsOwnerOnly(String fname, String lname) throws InterruptedException {

    	uploadprofilepic.sendKeys(imgurl);
		firstnamefield.sendKeys(fname);
		secondnamefield.sendKeys(lname);
		ownercheckbox.click();
		coachcheckbox.click();
		continuebutton.click();
		System.out.println("profile info filled");
		Thread.sleep(4000);

	}

	public void signUpAsCoachAndOwner(String fname, String lname) throws InterruptedException {

		uploadprofilepic.sendKeys(imgurl);
		firstnamefield.sendKeys(fname);
		secondnamefield.sendKeys(lname);
		ownercheckbox.click();
		continuebutton.click();
		System.out.println("profile info filled");
		Thread.sleep(4000);

	}

}
