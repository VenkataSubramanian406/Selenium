import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		
		Actions actions= new Actions(driver);
		actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		actions.dragAndDrop(From, To).build().perform();
		
//		actions.clickAndHold(From).moveToElement(To).release().build().perform();
//		actions.dragAndDrop(From, To).build().perform();
	}

}
