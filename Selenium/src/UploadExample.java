 import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement uploadButton=driver.findElement(By.name("filename"));
		uploadButton.sendKeys("C:\\Users\\arkam\\Downloads\\vaigai.pdf");
		
//		//WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
//		uploadButton.click();
//		
//		Thread.sleep(2000);
//		StringSelection selection=new StringSelection("C:\\Users\\arkam\\Downloads\\vaigai.pdf");
//		
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//C:\Users\arkam\Downloads
		//C:\Users\arkam\Downloads
		
	}

}
