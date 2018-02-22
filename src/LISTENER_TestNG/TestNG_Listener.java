package LISTENER_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Case start and details are:"+result.getName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Case Success and details are:"+result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Case Fail and details are:"+result.getName());
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Case skipped and details are:"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{


	}

	public void onStart(ITestContext context) 
	{


	}

	public void onFinish(ITestContext context) 
	{


	}

}
