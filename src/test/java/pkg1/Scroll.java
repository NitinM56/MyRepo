package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_1mkliO'])[3]")).click();
		Thread.sleep(5000);		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,4000)");            //Scroll Down(+ve)
        Thread.sleep(3000);
        System.out.println("Scrolled down..");          

        js.executeScript("window.scrollBy(0,-2000)");           //Scroll Up (-ve)
        Thread.sleep(3000);
        System.out.println("Scrolled up..");
        Thread.sleep(3000);
        driver.quit();
	}

}
