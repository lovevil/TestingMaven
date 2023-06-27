package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ActionClass {

	WebDriver driver;

	public ActionClass(WebDriver driver) {
		this.driver = driver;
	}

	public static Properties readProperty() {

		Properties property = new Properties();
		FileInputStream fis;

		try {

			fis = new FileInputStream(
					new File("/Users/sainis/eclipse-workspace/TestingMaven/resources/data.properties"));
			property.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;

	}

	public static void takeScreenshot(WebDriver driver, String destination) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);

		File destfile = new File(destination);

		FileUtils.copyFile(srcfile, destfile);

	}

}
