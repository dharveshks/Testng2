package testng;

import org.testng.annotations.Test;

public class Five {

	
		@Test(expectedExceptions = NullPointerException.class)
		private void add() {
			
//			int a = 5 ;
			
			
			String name = null;
			
			
			
			
			
			System.out.println(name.length());
		}
	
	
}
