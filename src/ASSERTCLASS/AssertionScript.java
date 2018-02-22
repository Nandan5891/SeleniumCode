package ASSERTCLASS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {
	
	@Test 
	public void test1()
	{
	System.out.println("Test Case 1 Started");
	Assert.assertEquals(12, 13);
	System.out.println("Test case 1 Completed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 Started");
		Assert.assertEquals(12, 13,"DropDown Count doesnt match please check with developer");
		System.out.println("Test case 2 Completed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test Case 3 Started");
		Assert.assertEquals("Hello", "Hello","Words doesnt match please raise a bug");
		System.out.println("Test case 3 Completed");
	}
}
