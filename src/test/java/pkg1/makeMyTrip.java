package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makeMyTrip {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("PUNE");
		Thread.sleep(2000);		
		List<WebElement> from=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));
		//System.out.println(from.size());		
		for(WebElement frm:from) {
			//System.out.println(frm.getText());
			if (frm.getText().contains("Pune, India")) {
				frm.click();
				break;
			}			
		}
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		List<WebElement> to=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));
		//System.out.println(to.size());		
		for(WebElement frm:to) {
			//System.out.println(frm.getText());
			if (frm.getText().contains("Mumbai, India")) {
				frm.click();
				break;
			}			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(5000);
		 String flag = "False";
		  while(flag=="False") {
			  if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Dec 10 2022')]")).size()>0) {
				    
				   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Dec 10 2022')]")).click(); 
				   flag="True";
				   Thread.sleep(5000);
		  }
			  else {
				    Thread.sleep(5000);
				    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				   }
		  }
		  Thread.sleep(5000);
		  driver.quit();
		
		//driver.quit();
		
	}

}
