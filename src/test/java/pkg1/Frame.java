package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SwitchTo")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu']/li)[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs ']/li[2]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));//SingleFrame.html
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//div[@class='container']/div/div/input")).sendKeys("ABCD");
		Thread.sleep(2000);
	
		
		
		
		driver.quit();

	}

}
