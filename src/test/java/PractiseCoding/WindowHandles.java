package PractiseCoding;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {


	public void test() {

		String url="";

		String expected = "tab3";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(url);

		Set<String> val = driver.getWindowHandles();


		for(String string : val) {



		}

	}

}
