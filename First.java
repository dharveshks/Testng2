package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class First {

	@Test(priority=-3)
	private void flipkart() {
		
		
		System.out.println("im in flipkart");

	}
	
	
	@Test(priority = -2)
	private void amazon() {
		
		
		System.out.println("im in amazon");

	}
	
	
	@Test(priority = -1,enabled = false)
	private void myntra() {
		
		System.out.println("im in myntra");


	}

	@Test
	private void ajio() {
		
		System.out.println("im in ajio");

	}
	
}
