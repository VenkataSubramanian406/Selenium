package testNG;

import org.testng.ITestListener;

public class ListenersExample implements ITestListener{ 
	
	
	public void onTestStart(ITestListener results) {
		// TODO Auto-generated method stub
		System.out.println("Test case is going to execute");
	}
	
	public void onTestSuccess(ITestListener results) {
		// TODO Auto-generated method stub
		System.out.println("Test case is passed");
	}
	
	public void onTestFailure(ITestListener results) {
		System.out.println("Test case is failure");
	}
	
	public void onTestSkipped(ITestListener results) {
		System.out.println("Test case is skipped");
	}
	
	public void onTestFailedButWithInSuccessPercentage(ITestListener results) {
			}
	
	public void onStart(ITestListener results) {
		System.out.println("before everything");
	}

	public void onFinish(ITestListener results) {
		System.out.println("after everything");
	}
}
