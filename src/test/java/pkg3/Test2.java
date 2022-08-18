package pkg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.selenium.BrowserInit;

public class Test2 {
	// 
	public static WebDriver driver =  null;
	
	@Test //(priority = 0)
	public void login_test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		System.out.println("Login TEst");
		//driver = initBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test //(priority = 1)
	public void dashboard_test()
	{
		System.out.println("Dashboard");
		// code
	}
	
	@Test //(priority = 1)
	public void admin_test() throws InterruptedException
	{
		System.out.println("admin_test ");
		Thread.sleep(2000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	

}
