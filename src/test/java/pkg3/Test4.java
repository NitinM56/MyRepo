package pkg3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void m1() {
		System.out.println(" m1");
	}

	@BeforeMethod
	public void m3() {
		System.out.println("@BeforeMethod");

	}

	@AfterMethod
	public void m4() {
		System.out.println("@AfterMethod");
	}

	@BeforeClass
	public void m5() {
		System.out.println("@BeforeClass ");

	}

	@AfterClass
	public void m6() {
		System.out.println("@AfterClass");
	}

	@BeforeTest
	public void m7() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void m8() {
		System.out.println("@AfterTest");
	}
	
	@BeforeSuite
	public void m9() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void m10() {
		System.out.println("@AfterSuite");
	}
	
	
	

}