package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Six {

	
	@Test(invocationCount = 3)
	private void add() {

		//Hardassert or validation
		
		String actual = "Dhoni";
		
		String expected = "Dhoni";
		
		
//		Assert.assertEquals(actual, expected);// correct
//		
		Assert.assertNotEquals(actual, expected);// correct
		
		
		
		//softAssert or verification
		
//		SoftAssert soft=new SoftAssert();
////		
//		soft.assertNotEquals(actual, expected);
		
		
		
		
		
	
}
	
	@Test
	private void sub() {

		String actual = "SRT";
		
		String expected = "SR";
		
		
		Assert.assertEquals(actual, expected);
		
	}

}