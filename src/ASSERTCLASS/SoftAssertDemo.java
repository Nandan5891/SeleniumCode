package ASSERTCLASS;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void testsoft()
	{
	 SoftAssert assertion= new SoftAssert();
	 System.out.println("Test1 Started");
	 assertion.assertEquals(12, 13);
	 System.out.println("Test1 Completed");
	 assertion.assertAll();
	}
	
	@Test
	public void HardAssert()
	{
	 System.out.println("Test 2 Started");
	 Assert.assertEquals(12, 13,"Count doesn't match");
	 System.out.println("Test 2 Completed");
	}
}
