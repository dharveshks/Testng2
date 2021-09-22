package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Eight {
	
	
	
	@Test(dataProvider = "demo")
	private void add(String un , int pw) {
		System.out.println(un);
		System.out.println(pw);
		
		
	}
	
	
	@DataProvider
	private Object[][] demo() {
		
		return new Object[][] {
			
			
			{"abc",17}
		};
		
		
		
	}
	
	

}
