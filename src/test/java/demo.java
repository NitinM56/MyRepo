import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.xpath("//input[@id='imagesrc']"));		
		Actions action =new Actions(driver);
		action.moveToElement(file).click().build().perform();
		Thread.sleep(4000);
		Robot rb=new Robot();
		StringSelection str = new StringSelection("C:\\Users\\NitinMali.RENDITIONSYS\\Desktop\\Limaye.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	    
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(10000);
		
		driver.quit();
		
		

	}

}
