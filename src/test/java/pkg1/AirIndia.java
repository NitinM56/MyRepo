package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AirIndia {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(2000);
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)"); 
        Thread.sleep(3000);
        driver.findElement(By.id("lblOneWay")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='flight-deg']/div/input)[1]")).sendKeys("PNQ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='ui-id-2']/li/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='flight-deg']/div/input)[2]")).sendKeys("BLR");
        Thread.sleep(2000);      
        driver.findElement(By.xpath("//ul[@id='ui-id-3']/li/a")).click();        
        Thread.sleep(2000);
        driver.findElement(By.id("_depdateeu1")).click();
        Thread.sleep(2000);//...(//td[@data-month='11'][@data-year='2022']/a)[10]
        String flag = "False";
		  while(flag=="False") {
			  if(driver.findElements(By.xpath("(//td[@data-month='11'][@data-year='2022']/a)[10]")).size()>0) {
				    
				   driver.findElement(By.xpath("(//td[@data-month='11'][@data-year='2022']/a)[10]")).click(); 
				   flag="True";
				   Thread.sleep(5000);
		  }
			  else {
				    Thread.sleep(5000);
				    driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a")).click();
				   }
		  }       
        
		   Thread.sleep(5000);
        
		driver.quit();
		
	}

}
