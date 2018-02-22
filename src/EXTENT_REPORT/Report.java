package EXTENT_REPORT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import LIBRARAY.ScrShots;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {

	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;

	@Test
	public void TitleVerify()
	{
		report= new ExtentReports("F:\\SELENIUM REPORTS\\Example.html");
		
		logger=report.startTest("TitleVerify");
		
		System.setProperty("webdriver.chrome.driver", "H:\\SOFTWARE\\DRIVER SELENIUM PLUGIN\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		logger.log(LogStatus.INFO,"Browser Loaded");
		
		driver.get("http://medimention.com/");
		
		logger.log(LogStatus.INFO, "Application is Up and Running");
		
		String actual_title=driver.getTitle();
		
		Assert.assertTrue(actual_title.contains("Medi Mention-All Medical Solution "));
		
		logger.log(LogStatus.PASS, "Title Verified");
		
	}

	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ScrShots.captureScreenshot(driver, result.getName());	
			logger.log(LogStatus .FAIL,"Ram","Title Verification");
		}
	
		report.endTest(logger);
	 	report.flush();
		driver.get("F:\\SELENIUM REPORTS\\Example.html");
	}
	
	}
	


