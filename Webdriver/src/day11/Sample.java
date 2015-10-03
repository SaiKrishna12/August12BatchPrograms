package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	//prioritizing of test cases 
	@Test(priority=0) 
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=1)
	public void regTest()
	{
		System.out.println("This is for reg app");
	}
	//Ignoring of test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	@BeforeMethod
	public void fun()
	{
		System.out.println("abc");
	}
}
