package PRACTICE;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample {
	
	
	
	
	
	@Test
	public void LoginPage()
	{
		Assert.assertEquals(12, 13);
		System.out.println("LoginPage");
	}
	
	@Test(dependsOnMethods="LoginPage")
	public void BrowsingPage()
	{
		
		System.out.println("BrowsingPage");
		
	}
	
	@Test(dependsOnMethods="BrowsingPage")
	public void LogoutPage()
	{
		
		System.out.println("LogoutPage");
		
	}
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("Before Suite");
	}
}
