import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement dateToBeGiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		
		dateToBeGiven.click();
		
	}

}
