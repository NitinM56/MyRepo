package pkg3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test5 {
	
	@Test
	public void m1() {
		System.out.println(" m1--- From Test5");
	}
	
	@AfterTest
	public void m2() {
		System.out.println(" @AfterTest -- Test5");
	}
	

}
