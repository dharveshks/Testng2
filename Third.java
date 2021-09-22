package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Third {

	
	
	@Test
	private void hp() {
		
		System.out.println("hp");
		
		//USERNAME //un
		//PASSWORD //pw
	}
	
	
	@Test
	private void vk() {

		System.out.println("Vk");

	}
	
	@Test(invocationCount = 3, priority = -1)
	private void ms() {
		System.out.println("ms");

	}

	
	@Test
	private void srt() {
		System.out.println("srt");

	}

}
