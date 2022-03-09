import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(2000);
		
		List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		System.out.println(optionsList.size());
		
		for (WebElement webElement : optionsList) {
			
		if	(webElement.getText().equals("Web Services")) {
			webElement.click();
			System.out.println("If part");
			break;
			
		}
		}
		
		
	}

}
