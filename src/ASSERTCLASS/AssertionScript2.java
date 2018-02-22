package ASSERTCLASS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript2 {
	
	@Test
	public void test1()
	{
	String mystr="Ram Nandan";
	Assert.assertTrue(mystr.contains("Ram Nandan"));
	System.out.println("Test case 1 is completed");
	}
	
	@Test
	public void test2()
	{
		String mystr="Program";
		Assert.assertTrue(mystr.contains("pro"),"Names are not matching");
	}
}
