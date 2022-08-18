package com.listeners;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListerners.class)
public class Test1 {
	
	@Test
	public void login_test()  // fail
	{
		System.out.println("Login Test");
		int i =10/0;  
		System.out.println(i);
	}
	
	@Test(dependsOnMethods = "login_test")  // Skip
	public void admin_test()   
	{
		System.out.println(" admin_test");
	}

	
	@Test
	public void dashboard_test()  // pass
	{ 
		System.out.println(" dashboard_test ");
	}


}