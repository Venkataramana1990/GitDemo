package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I have executed successfully after the test is passed");
	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("I have executed successfully after the test is failed" + result.getName());
	}
}
