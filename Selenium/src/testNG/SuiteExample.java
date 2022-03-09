package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
//Aim: open chrome and go to
//1.google.co.in 2.bing.com 3.yahoo.com and then close the browser
	
	@BeforeSuite
	public void launchBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	@Test
	public void opengoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test
    public void openbing() {
		driver.get("http://www.bing.com");
	}
	@Test
    public void openyahoo() {
		driver.get("http://www.yahoo.com");
    }
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
		
	}
	    
	
	
	
	//suite=collection of test case
	
	

}
