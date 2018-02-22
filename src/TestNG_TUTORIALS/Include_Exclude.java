package TestNG_TUTORIALS;

import org.testng.annotations.Test;

public class Include_Exclude {
	
	@Test(groups="Sanity-Group")
	public void Test1()
	{
		System.out.println("This belongs to sanity group");
	}
	
	@Test(groups="Regression-Group")
	public void Test2()
	{
		System.out.println("This TestCases 2  belongs to Regression group");
	}
	
	@Test(groups="Sanity-Group")
	public void Test3()
	{
		System.out.println("This belongs to sanity group");
	}
	
	@Test(groups="Regression-Group")
	public void Test4()
	{
		System.out.println("This Testcases 4 belongs to Regression group");
	}
}

// all test will run from here but 
// see xml file where regression group is exclude it means it will not excute if you want to execute then convert 
// exclude into include