package com.PageElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ActionClass;

public class ClassSummaryPage extends ActionClass {

	WebDriver driver;

	public ClassSummaryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[local-name()='svg' and @data-icon=\"heart\"]")
	private WebElement heartrateicon;

	@FindBy(xpath = "//tbody//tr[1]")
	private List<WebElement> classlist;

	@FindBy(xpath = "//span[@class=\"name \"]")
	private WebElement classnamelink;

	public String xpathclasslist = "//tbody//tr[1]";
	
	public String xpathclassnamelink = "//span[@class=\"name \"]";


	public void openClassSummary(String classname) {

		if (classnamelink.getText() == classname) {
			classnamelink.click();
		}

	}

}
