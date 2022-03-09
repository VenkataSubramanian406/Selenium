

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

		//1.Get the XY position
		WebElement getPositionButton= driver.findElement(By.id("position"));

		Point xy = getPositionButton.getLocation();
		int xValue = xy.getX();
		int yValue = xy.getY();

		System.out.println("X Value :" +xValue + " Y Value :" +yValue);

		WebElement ButtonColor=driver.findElement(By.id("color"));
	    String Color = ButtonColor.getCssValue("background-color");
	    System.out.println("Button color is :"+Color);
	    
	    WebElement SizeBox=driver.findElement(By.id("size"));
	    int height = SizeBox.getSize().getHeight();
     	int width = SizeBox.getSize().getWidth();
		System.out.println("Height is :"+height + "Width is :" + width);
		
		WebElement homebutton=driver.findElement(By.id("home"));
		homebutton.click();
		

	}

	private static void getCssValue(String string) {
		// TODO Auto-generated method stub
		
	}

}
