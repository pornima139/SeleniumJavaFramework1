package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgIgnoreDemo {
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("i am inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("i am inside test2");
	}
}
