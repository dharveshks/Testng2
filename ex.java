package testng;

import org.testng.annotations.Test;

public class ex {

	
	@Test(expectedExceptions = ArithmeticException.class)
	private void ad() {

		int a = 5 ;
				
			System.out.println(a/0);	
		
	}
	
}
