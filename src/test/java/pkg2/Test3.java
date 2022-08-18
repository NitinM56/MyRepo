package pkg2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void m4() {
		System.out.println("Call M4");		
	}
	@Test
	public void m5() {
		System.out.println("Call M5");
		
	}
	@BeforeSuite
	public void m6() {
		System.out.println("@BeforeSuite Call M6");
				
	}
	@BeforeClass
	public void m7() {
		System.out.println("@BeforeClass Call M7");		
	}
	@BeforeTest
	public void m8() {
		System.out.println("@BeforeTest Call M8");		
	}
	
	@BeforeMethod
	public void m9() {
		System.out.println("@BeforeMethod Call M9");		
	}
	
	@AfterSuite
	public void m10() {
		System.out.println("@AfterSuite Call M10");
				
	}
	@AfterClass
	public void m11() {
		System.out.println("@AfterClass Call M11");		
	}
	@AfterTest
	public void m12() {
		System.out.println("@AfterTest Call M12");		
	}
	
	@AfterMethod
	public void m13() {
		System.out.println("@AfterMethod Call M13");		
	}	

}
