package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	public static void main(String args[]) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}
		
		
	

}
