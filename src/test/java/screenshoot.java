import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshoot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(2000);		
		List<WebElement> alllink=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		//System.out.println(alllink.size());			
		for(WebElement slist:alllink) {			
			//System.out.println(slist.getText());
			if(slist.getText().contains("Practice Site")) {
				slist.click();
				break;
			}	
		}
		//driver.findElement(By.linkText("Practice Site")).click();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//div/div/ul[@class='products']/li/a"));
		//System.out.println(list.size());
		for(WebElement slist:list) {
			//System.out.println(slist.getText());
			if(slist.getText().contains("Mastering JavaScript")){
				slist.click();
				break;				
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul/li/a[@rel='nofollow'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul/li/a[@rel='nofollow'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul/li/a[@class='added_to_cart wc-forward'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/a[@class='checkout-button button alt wc-forward']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("billing_first_name")).sendKeys("Abcd");
		Thread.sleep(2000);
		driver.findElement(By.id("billing_last_name")).sendKeys("cdes");
		Thread.sleep(2000);
		driver.findElement(By.id("billing_email")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("billing_phone")).sendKeys("9632587410");
		Thread.sleep(2000);
		driver.findElement(By.id("billing_address_1")).sendKeys("Pune");
		Thread.sleep(2000);
		//driver.findElement(By.id("billing_address_2_field")).sendKeys("FC Road");
		Thread.sleep(2000);
		driver.findElement(By.id("billing_city")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("s2id_billing_state")).click();
		Thread.sleep(2000);
		
		List<WebElement> State= driver.findElements(By.xpath("//ul[@id='select2-results-2']/li/div/span"));
		for (WebElement sstate:State) {
			if(sstate.getText().contains("Maharashtra"))
				sstate.click();
				break;			
		}
		
		//Select objSelect =new Select(driver.findElement(By.id("s2id_billing_state")));
		//objSelect.selectByIndex(2);//By.xpath("//select[@id='billing_state']"))
		driver.findElement(By.id("billing_postcode")).sendKeys("411043");
		Thread.sleep(2000);
		driver.findElement(By.id("payment_method_cod")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("place_order")).click();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
	
		
	}

}
