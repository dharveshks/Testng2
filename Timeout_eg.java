package testng;

import org.testng.annotations.Test;

public class Timeout_eg {

	
	@Test
	private void fm() {
		
		
		System.out.println("fm");

	}
	
	@Test(timeOut = 3500)
	private void fmm() throws InterruptedException {
		
//		Thread.sleep(2000);
		System.out.println("fmm");

	}
}
