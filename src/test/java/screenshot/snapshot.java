package screenshot;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pkg1.demo;

public class snapshot {
	
	
	public static void screenshot() throws IOException {
		
		Date d = new Date();
        //System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");  
		
		TakesScreenshot t=(TakesScreenshot) demo.driver;
		
		File f= t.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("D:\\Nitin\\Selenium java\\DemoAutomation\\src\\test\\resources\\ScreenShot\\"+sdf.format(d)+".png"));
				
		
	}

}
