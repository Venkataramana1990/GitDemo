package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters ({"URL","Username"})
	@Test 
	public void ACTestcases(String urlname, String username) {
		
		System.out.println("Alpinello its Appium testcases");
		System.out.println(urlname);
		System.out.println(username);
	}
	
	@Test(dataProvider = "getdata")
	public void ABitestCases(String username, String password) {
		System.out.println("Barracuda Jmeter test cases");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		//first data set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		// second data set
		data[1][0] = "second user name";
		data[1][1] = "second password";
		
		//third data set
		data[2][0] = "third username";
		data[2][1] = "third password";
		return data;
		
			
	}
	
	
}
