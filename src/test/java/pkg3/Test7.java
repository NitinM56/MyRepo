package pkg3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test7 {
	
	@Test
	public void m2() {
		System.out.println(" m2 -- Test7");
	}
	
	
	@AfterMethod
	public void m3() {
		System.out.println(" @BeforeMethod");
	}
	
	

}
