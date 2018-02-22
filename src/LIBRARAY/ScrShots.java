 package LIBRARAY;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScrShots {
	public static void captureScreenshot(WebDriver driver,String screenshotname)
	{
		
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
		 	File source=ts.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(source, new File("H:\\DATA\\SOFTWARE TESTING\\ScreenShot\\"+screenshotname+".png"));
			FileUtils.copyFile(source, new File("./CaptureScreenshot/"+screenshotname+".png"));
		} 
		
		catch (Exception e)
		{
		System.out.println("Exceptioin is:"+e.getMessage());	
		} 
	}
}
