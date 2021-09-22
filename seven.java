package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class seven {

	
	@Test
	@Parameters("testparameter")
	private void aa(int age) {
		
		
		System.out.println("your age is "+age);
		
	
	}
	
	
	
	
	
}
