package pkg1;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabhandles {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Index.html");        
        driver.manage().window().maximize();
        
        String currentHandle= driver.getWindowHandle();
        
   
        ((JavascriptExecutor)driver).executeScript("window.open()");
        
        //getting all the handles currently avaialbe
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles)
        {
            
         if(!actual.equalsIgnoreCase(currentHandle))
         {
             //switching to the opened tab
             driver.switchTo().window(actual);                         
         
         }
        }
        Thread.sleep(5000);
      driver.quit();
    }

}