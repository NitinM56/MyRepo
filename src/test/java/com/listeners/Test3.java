package com.listeners;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListerners.class)
public class Test3 {

	@Test
	public void m1() {
		System.out.println("m1 call");
		
		// code
	}
	
	@Test
	public void m2() {
		System.out.println("m2 call");
		int i =10/0;
		System.out.println(i);
		
		// code
	}
	
	@Test
	public void m3() {
		System.out.println("m3 call");
		int i =10/0;
		System.out.println(i);
		
		// code
	}

}


