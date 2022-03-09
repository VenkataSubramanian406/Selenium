import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
	
		WebElement alertbox=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement confirmbutton=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbutton.click();
		
		Alert confirmalert=driver.switchTo().alert();
		Thread.sleep(2000);
		confirmalert.dismiss();
		
		WebElement promptbox=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("duck");
		Thread.sleep(2000);
		promptalert.accept();
	}


}
