package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class OngoingClassPage extends ActionClass {

	WebDriver driver;

	public OngoingClassPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"schedule_action flexG\"]//span[1]")
	private WebElement joinclassicon;

	@FindBy(xpath = "//div[@class=\"schedule_action flexG\"]//span[2]")
	private WebElement copyclasslinkicon;
	
	@FindBy(xpath = "//*[local-name()=\"svg\"][@class=\"svg-inline--fa fa-times fa-w-11 \"]")
	private WebElement popupcrossicon;
	
	@FindBy(xpath = "//*[@class=\"svg-inline--fa fa-clone fa-w-16 copy_icon\"][1]")
	private WebElement copyclassinvite;

	@FindBy(xpath = "(//*[@class=\"svg-inline--fa fa-clone fa-w-16 copy_icon\"])[2]")
	private WebElement copyclasslink;

	
	public void joinClass() throws InterruptedException {
		joinclassicon.click();
		Thread.sleep(3000);
	}
	
	public void copyClassInvite() {
		copyclasslinkicon.click();
		copyclassinvite.click();
		popupcrossicon.click();
	}

	public void copyClassLink() {
		copyclasslinkicon.click();
		copyclasslink.click();
		popupcrossicon.click();
	}

	public void closeClassLinkPopUp() {
		copyclasslinkicon.click();
		popupcrossicon.click();
	}
	
	
}
