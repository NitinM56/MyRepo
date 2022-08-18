package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderExample {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(5000);
		 String flag = "False";
		  while(flag=="False")
		  {
			  if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Dec 10 2022')]")).size()>0) 
			  {
				    
				   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Dec 10 2022')]")).click(); 
				   flag="True";
				   Thread.sleep(5000);
			  }
			  else 
			  {
				    Thread.sleep(5000);
				    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			  }
		  }
		  System.out.println("Test case is passed");
		  driver.close();
		

	}

}
