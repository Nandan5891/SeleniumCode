package TestNG_TUTORIALS;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@Test(priority=1,description="This test case will verify the login functionality")
	public void loginapplication()
	{
		Assert.assertEquals(12, 13); 
		System.out.println("This is login page");	
		// here this test case will not run as validation is not true(12 doestnot equal to 13)
	}
	
	@Test(priority=2,description="This test case will add some item in basket")
	public void selectedItem()
	{
		
		System.out.println("Selected Item");	
	}
	
	@Test(priority=3,description="This test case will perform checkout operation")
	public void CheckOut()
	{
		System.out.println("Checkout completed");	
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}	
}

// by default it runs by alphabetical order for the sequence we have to set the priority.
// if one test case fail it doesn't effect on another test case. it means other testcases will run successfully.
// Before class will run before the execution of all test cases and after class will run after the exe of all test cases.
// it doesn't matter test cases fail or execute, after and before will always execute.
