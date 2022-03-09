import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("Test@duck.com");
		
		WebElement appendbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Text");
		
		WebElement getTextBox=driver.findElement(By.name("username"));
	    String value=	getTextBox.getAttribute("value");
	    
	    System.out.println(value);
	    
	    WebElement clearBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	    clearBox.clear();
	    
	    WebElement disabledbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	    boolean enabled = disabledbox.isEnabled();
	    
	    System.out.println(enabled);
		
	}

}
