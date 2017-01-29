import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomisedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://techno-geek.co.uk/SeleniumPractice/Form.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
		
		
		/*sendKeys(charsequence) works with String when you change Java compiler from 1.4 to newest (1.7). 
		 * 
   1 Right click on your java project and select Build Path -> Click on
    Configure Build Path...
   2 In project properties window, Click/select Java Compiler at the left
    panel
   3 At the right panel, change the Compiler compliance level from 1.4 to 1.7
    (Select which is higher version in your eclipse)
    4Lastly Click on Apply and OK

		 */
		/*Customized Xpath:
		Syntax : "//tagname[@attribute='value']" */
		
		String name = "random text"; // or args
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(args[0]);
		//driver.close();
		//driver.quit();
	}

}
