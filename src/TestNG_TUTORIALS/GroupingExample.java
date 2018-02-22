package TestNG_TUTORIALS;

import org.testng.annotations.Test;

public class GroupingExample {

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

// if we want to execute only sanity group then run this program using GroupExample.xml file .
// We can execute group wise this program using xml file. visit the xml file.
// As we run this program from here then it will execute all the test cases but using xml where I grouped only sanity.
// we can also group the regression 