package logInTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {

	String [][] data=null;
	WebDriver driver;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		
		data=getExcelData();
		return data;
	}
		
	public String[][] getExcelData() throws BiffException, IOException {
	    
		FileInputStream excel =new FileInputStream("C:\\Users\\arkam\\Downloads\\Venkat\\Book1.xls");
	     
		Workbook workbook=Workbook.getWorkbook(excel);
		
		Sheet sheet=workbook.getSheet(0);
		
		int rowCount=sheet.getRows();
		int columnCount= sheet.getColumns();
		
		String testData[][]=new String[rowCount-1][columnCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<columnCount; j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();		
				}
		}
	      return testData;
		}
	
	@BeforeTest
    public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
    }
		
	@Test(dataProvider="loginData")
	public void loginWithBothCorrect(String uName, String pword) {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword );
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
				
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
