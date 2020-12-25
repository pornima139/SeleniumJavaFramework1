package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParametersDemo {

	@Test
	@Parameters({"Myname"})
	public void test(@Optional("ojas") String name)
	{
		System.out.println("my name is "+name);
	}
}
