package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {

	@Test
	private void opengoogle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();

	}

	@Test
	private void openyahoo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.close();

	}
}
