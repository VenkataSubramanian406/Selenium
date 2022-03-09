package logInTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {

	@Test
	@Parameters({"username","password"})
	public void loginWithCorrectUsername(String uName, String pword) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.quit();
	}
}
