package pkg3;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6 {
	
	@Test
	public void m2() {
		System.out.println(" m2 -- Test6");
	}
	
	
	@BeforeMethod
	public void m3() {
		System.out.println(" @BeforeMethod");
	}
	
	

}