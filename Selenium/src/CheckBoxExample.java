import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement Java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		Java.click();
		
		WebElement selenium=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div"));
		boolean seleniumselected= selenium.isSelected();
		System.out.println(seleniumselected);
		
		WebElement firstElement=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]"));
		
		if(firstElement.isSelected()){
			firstElement.click();
		}
		
		WebElement secondElement=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]"));	
			if(secondElement.isSelected()){
				secondElement.click();
		}
		
	}

}
