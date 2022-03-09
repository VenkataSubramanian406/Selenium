import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		
		downloadLink.click();
		
		Thread.sleep(2000);
		
		File fileLocation= new File("C:\\Users\\arkam\\Downloads");
		
		File[] totalFiles=fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is downloaded");
				break; 
			}			
		}
		
		
	}

}
