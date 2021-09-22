package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Chck implements IRetryAnalyzer{

	int count = 1 , limit = 3 ;
	public boolean retry(ITestResult result) {
	
		
		if (count <= limit) {
			
			count++;
			
			
			return true ;
			
		}
		return false;
	}

}
