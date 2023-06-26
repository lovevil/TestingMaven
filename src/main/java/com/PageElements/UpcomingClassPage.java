package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class UpcomingClassPage extends ActionClass {

	WebDriver driver;
	public String waitingroomiconlocator = "//div[@class=\"schedule_action flexG\"]//span[1]";


	public UpcomingClassPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"schedule_action flexG\"]//span[1]")
	private WebElement openwaitingroomicon;

	@FindBy(xpath = "//div[@class=\"schedule_action flexG\"]//span[2]")
	private WebElement copyclasslinkicon;

	@FindBy(xpath = "//div[@class=\"schedule_action flexG\"]//span[3]")
	private WebElement dropdownicon;

	@FindBy(xpath = "//button[text()=\"Edit Class\"]")
	private WebElement editclassbutton;

	@FindBy(xpath = "//button[text()=\"Cancel Class\"]")
	private WebElement cancelclassbutton;
	
	@FindBy(xpath = "//button[text()=\"Yes\"]")
	private WebElement clickyesbuttononpopup;
	
	@FindBy(xpath = "//button[text()=\"No\"]")
	private WebElement clicknobuttononpopup;

	@FindBy(xpath = "//span[@class=\"coachListUi coachWidth flexG\"]/span")
	private WebElement assigncoachlink;

	@FindBy(xpath = "//*[local-name()=\"svg\"][@class=\"svg-inline--fa fa-times fa-w-11 \"]")
	private WebElement popupcrossicon;

	@FindBy(xpath = "//*[@class=\"svg-inline--fa fa-clone fa-w-16 copy_icon\"][1]")
	private WebElement copyclassinvite;

	@FindBy(xpath = "(//*[@class=\"svg-inline--fa fa-clone fa-w-16 copy_icon\"])[2]")
	private WebElement copyclasslink;


	public void openWaitingRoom() {
		openwaitingroomicon.click();
	}

	public void clickCopyLinkIcon() {
		copyclasslinkicon.click();
	}

	public void openDetailsDropDown() {
		dropdownicon.click();
	}

	public void clickeditClassButton() {
		openDetailsDropDown();
		editclassbutton.click();
	}

	public void clickCancelClassButton() {
		cancelclassbutton.click();
		clickyesbuttononpopup.click();
	}

	public void openAssignCoachPopUp() {
		assigncoachlink.click();
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
