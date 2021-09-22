package testng;

import org.testng.annotations.Test;

public class Amazon_eg {

	@Test(groups = "Tech")
	private void aalexa() {
		
		System.out.println("alexa");
	}
	
	@Test(groups = "Tech")
	private void afirestick() {
		
		System.out.println("firestick");

	}
	
	@Test(groups = "entertainment")
	private void akindle() {
		System.out.println("kindle");

	}
	@Test(groups = "Tech")
	private void aws() {
		System.out.println("cloud");

	}
	@Test(groups = "entertainment")
	private void aprime() {
		System.out.println("prime");

	}
	
	@Test(groups = "entertainment")
	private void amusic() {
		System.out.println("music");

	}
	
}
