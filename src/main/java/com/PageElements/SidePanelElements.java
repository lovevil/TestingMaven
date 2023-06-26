package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;


public class SidePanelElements extends ActionClass  {

	WebDriver driver;

	public SidePanelElements(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@href=\"/ongoingActivity\"]")
	private WebElement ongoingscreenlink;

	@FindBy(xpath="//a[@href=\"/scheduleClass\"]")
	private WebElement scheduleclassscreenlink;

	@FindBy(xpath="//a[@href=\"/schedule\"]")
	private WebElement upcomingclassscreenlink;

	@FindBy(xpath="//a[@href=\"/classSummary\"]")
	private WebElement classsummaryscreenlink;

	@FindBy(xpath="//span[contains(text(),'Members')]")
	private WebElement memberstablink;

	@FindBy(xpath="//a[@href=\"/member/inviteMember\"]")
	private WebElement invitedmembersscreenlink;

	@FindBy(xpath="//a[@href=\"/member/active\"]")
	private WebElement activemembersscreenlink;

	@FindBy(xpath="//a[@href=\"/member/pending\"]")
	private WebElement pendingmembersscreenlink;

	@FindBy(xpath="//a[@href=\"/member/inactive\"]")
	private WebElement inactivemembersscreenlink;

	@FindBy(xpath="//a[@href=\"/member/rejected\"]")
	private WebElement rejectedmembersscreenlink;

	@FindBy(xpath="//span[contains(text(),'Coaches')]")
	private WebElement coachestablink;

	@FindBy(xpath="//a[@href=\"/coach/active\"]")
	private WebElement activecoachesscreenlink;

	@FindBy(xpath="//a[@href=\"/coach/pending\"]")
	private WebElement pendingcoachesscreenlink;

	@FindBy(xpath="//a[@href=\"/coach/inactive\"]")
	private WebElement inactivecoachesscreenlink;

	@FindBy(xpath="//a[@href=\"/coach/rejected\"]")
	private WebElement rejectedcoachesscreenlink;

	@FindBy(xpath="//a[@href=\"/gyms\"]")
	private WebElement studioscreenlink;

	@FindBy(xpath="//span[contains(text(),'Video Library')]")
	private WebElement videolibrarytablink;

	@FindBy(xpath="//a[@href=\"/onDemand\"]")
	private WebElement ondemandclassesscreenlink;

	@FindBy(xpath="//a[@href=\"/recorded\"]")
	private WebElement recordedliveclassesscreenlink;

	@FindBy(xpath="//a[@href=\"/media\"]")
	private WebElement mediaassetscreenlink;

	@FindBy(xpath="//span[contains(text(),'Class Template')]")
	private WebElement classtemplatetablink;

	@FindBy(xpath="//a[@href=\"/template/my\"]")
	private WebElement templatescreenlink;

	@FindBy(xpath="//a[@href=\"/integrations\"]")
	private WebElement integrationsscreenlink;

	@FindBy(xpath="//a[@href=\"/Payments\"]")
	private WebElement paymentscreenlink;

	@FindBy(xpath="//span[contains(text(),'Settings')]")
	private WebElement settingstablink;

	@FindBy(xpath="//a[@href=\"/rooms\"]")
	private WebElement roomsscreenlink;

	@FindBy(xpath="//a[@href=\"/location\"]")
	private WebElement locationscreenlink;

	@FindBy(xpath="//a[@href=\"/deleteAccount\"]")
	private WebElement deleteaccountscreenlink;



	// code for interacting with side panel elements


	public void openOngoingScreen() {
		ongoingscreenlink.click();
	}

	public void openScheduleClassScreen() {
		scheduleclassscreenlink.click();
	}

	public void openUpcomingClassScreen() {
		upcomingclassscreenlink.click();
	}

	public void openClassSummaryScreen() {
		classsummaryscreenlink.click();
	}

	public void clickMembersTab() {
		memberstablink.click();
	}

	public void openInvitedMemberScreen() {
		invitedmembersscreenlink.click();
	}

	public void openActiveMemberScreen() {
		activemembersscreenlink.click();
	}

	public void openPendingMemberScreen() {
		pendingmembersscreenlink.click();
	}

	public void openInActiveMemberScreen() {
		inactivemembersscreenlink.click();
	}

	public void openRejectedMemberScreen() {
		rejectedmembersscreenlink.click();
	}


	public void clickCoachesTab() {
		coachestablink.click();
	}

	public void openActiveCoachesScreen() {
		activecoachesscreenlink.click();
	}

	public void openPendingCoachesScreen() {
		pendingcoachesscreenlink.click();
	}

	public void openInActiveCoachesScreen() {
		inactivecoachesscreenlink.click();
	}

	public void openRejectedCoachesScreen() {
		rejectedcoachesscreenlink.click();
	}

	public void openStudioScreen() {
		studioscreenlink.click();
	}

	public void clickVideoLibraryTab() {
		videolibrarytablink.click();
	}

	public void openOnDemandClassesScreen() {
		ondemandclassesscreenlink.click();
	}

	public void openRecordedLiveClassesScreen() {
		recordedliveclassesscreenlink.click();
	}

	public void openMediaSAssetScreen() {
		mediaassetscreenlink.click();
	}

	public void clickTemplateTab() {
		classtemplatetablink.click();
	}

	public void openTemplateListScreen() {
		templatescreenlink.click();
	}

	public void openIntegrationsScreen() {
		integrationsscreenlink.click();
	}

	public void openPaymentsScreen() {
		paymentscreenlink.click();
	}

	public void clickSettingsTab() {
		settingstablink.click();
	}

	public void openRoomsScreen() {
		roomsscreenlink.click();
	}

	public void openLocationScreen() {
		locationscreenlink.click();
	}

	public void openDeleteAccountScreen() {
		deleteaccountscreenlink.click();
	}










}
