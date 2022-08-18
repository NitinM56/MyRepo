package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {
public static WebDriver driver ;
	
	//  DataProvider :
	// @DataProvider
	// Object[][]  :== 
	
	
	@DataProvider
	public Object[][] data()
	{
		                    //     row colm
		Object[][] obj = new Object[5][2];
		obj[0][0] = "username";
		obj[0][1] = "pass";
		
		obj[1][0] = "admin";
		obj[1][1] = "admin123";
		
		obj[2][0] = "abc";
		obj[2][1] = "a1";
		
		obj[3][0] = "b1";
		obj[3][1] = "b";
		
		obj[4][0] = "c1";
		obj[4][1] = "c";
		
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void login_test(String uname , String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement email_txt =driver.findElement(By.id("email"));
		email_txt.clear();
		email_txt.sendKeys(uname);
		
		Thread.sleep(2000);
		WebElement pass_txt =driver.findElement(By.id("pass"));
		pass_txt.clear();
		pass_txt.sendKeys(pass);
		
		
	}

	@BeforeSuite
	public void open_browser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		//driver = initBrowser();
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterSuite
	public void close_browser()
	{
		driver.close();
	}

}
