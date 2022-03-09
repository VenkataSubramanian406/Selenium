 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
	
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		
		List<WebElement> listofoptions = select.getOptions();
		int  size = listofoptions.size();
		System.out.println("Number of elements: "+ size);
		
		
		dropdown1.sendKeys("Loadrunner");
		
		WebElement multiSelect= driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiSelectBox= new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		
		//*[@id="contentblock"]/section/div[6]/select	
		
		
		
		
		
	}

}
