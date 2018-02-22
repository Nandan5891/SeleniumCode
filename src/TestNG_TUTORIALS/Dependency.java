package TestNG_TUTORIALS;

import org.testng.Assert;
import org.testng.annotations.Test;

// test case 2 and test case 3 will be skipped as it depends on each other and test case 1 will be failed
public class Dependency {
	
	@Test
	public void startApp()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Starting App");	
	 // this test case will not run as validation is fail
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("Login Application");			
	}
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp()
	{
		System.out.println("Logout Application");	
	}
}
