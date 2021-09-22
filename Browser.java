package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Browser {
   WebDriver driver;
	
	@BeforeSuite
	private void set() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		

		}
	
	
	
	
	
	@Test
	private void google()  {
		
		driver.get("https://www.google.com/");
		
		
		
		
	}
	
	@Test
	private void yahoo()  {
		

		driver.get("https://in.yahoo.com/?p=us");
		
	}	
		
	@AfterSuite
	private void cl()
	{
		
		driver.close();
	}
		
	
}
