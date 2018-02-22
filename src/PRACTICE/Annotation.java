package PRACTICE;

import org.junit.Before;
import org.junit.Test;

public class Annotation {

	@Before
	public void fun()
	{
		System.out.println("fun");
	}
	@Test
	public void apple()
	{
		System.out.println("Apple");
	}
	
}
