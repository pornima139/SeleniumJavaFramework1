package demo;

import org.testng.annotations.Test;

public class testNgPriorityDemo {

	@Test(priority=1)
	public void one()
	{
		System.out.println("In am inside test1");
	}
	@Test(priority=1)
	public void two()
	{
		System.out.println("In am inside test2");

	}
	@Test(priority=1)
	public void three()
	{
		System.out.println("In am inside test3");

	}
}
