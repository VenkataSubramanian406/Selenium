import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arkam\\Downloads\\geckodriver-v0.30.0-win64.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.co.in");
	}

}
