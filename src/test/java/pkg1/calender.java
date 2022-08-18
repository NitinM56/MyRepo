package pkg1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div/div/div/input)[1]"));
		from.sendKeys("Pun");
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div/div/div/input)[2]"));	
		to.sendKeys("Mum");
		Thread.sleep(2000);
		List<WebElement> allmonth=driver.findElements(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[16]/div/div/div[1]/div"));
		for(WebElement smonth:allmonth) {
			//System.out.println(smonth.getText());
			if(smonth.getText().contains("December 2022")) {
				List<WebElement> alldays=driver.findElements(By.xpath("//div[@data-testid='undefined-month-December-2022']/div[3]/div/div"));
				for(WebElement sday:alldays) {
					if(sday.getText().contains("10")) {
						sday.click();
						break;
					}
				}				
				break;
			}
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
