import org.openqa.selenium.WebDriver;// Ctrl Shift O
import org.openqa.selenium.firefox.FirefoxDriver; // Ctrl Shift O


public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   WebDriver driver;
	   System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\geckodriver-v0.13.0-win64\\geckodriver.exe");
	   driver = new FirefoxDriver(); 
	   
	   driver.get("https://www.mozilla.org");

	}

}
