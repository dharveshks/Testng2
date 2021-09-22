package testng;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample {

	@Test
	private void fm() {
		
		System.out.println("1");

	}
	
	
	@Test(timeOut = 500)
	private void dsm() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("2");

	}
	
	
	
	
//	@Test
//	private void tm() {
//
//		System.out.println("3");
//	}
}
