package logInTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Workbook;

public class Login {

	String [][] data=null;
		
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		
		
		return data;
	}
	
	
	public void getExcelData() throws FileNotFoundException {
	    
		FileInputStream excel =new FileInputStream("C:\\Users\\arkam\\Downloads\\Venkat\\Book1.xls");
	     
		
	}
	
	@Test(dataProvider="loginData")
	public void loginWithBothCorrect(String uName, String pword) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword );
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.quit();
	}
}
