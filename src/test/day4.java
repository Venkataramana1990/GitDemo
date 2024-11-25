package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@Test (groups = {"smoke"})
	public void newtests() {
		
		System.out.println("we are day4 test cases");
	}
	
	@Test
	public void jmeternew() {
		System.out.println("i am day 4 test case for the jmeter");
		
		
	}
@BeforeTest
public void BeforeTesting() {
	System.out.println("This is a test for Before test which will come befoe the day 4 test");
}

}
