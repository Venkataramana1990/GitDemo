package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
	@Test 
	public void Demo() {
		
		System.out.println("yello its working");
	}
	
	@Test
	public void Secondtest() {
		System.out.println("Bye success");
		
	}
	
	@AfterTest
	public void Demoforaftertest(){
		
		System.out.println("Test for after Test");	
		}
	
	@BeforeTest
	public void TestforBeforeTest() {
		System.out.println("I will come before test");
	}
	@Test
	@BeforeSuite
	public void testforbeforesuite() {
		System.out.println("I am Before suite");
	}
	
	@Test
	@AfterSuite
	public void testforAftersuite() {
		System.out.println("I am After suite");
	}

}
