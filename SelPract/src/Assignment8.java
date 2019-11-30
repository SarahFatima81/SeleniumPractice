import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//syed//Desktop//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement countryOptions = driver.findElement(By.id("autocomplete"));
		
		countryOptions.sendKeys("tan");
		Thread.sleep(5000L);
		
		for(int i=1; i<10;i++){
			
			countryOptions.sendKeys(Keys.ARROW_DOWN);
		}
			countryOptions.sendKeys(Keys.ENTER);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    String script = "return document.getElementById(\"autocomplete\").value;";
		    String countrySelected = (String) js.executeScript(script);
		    System.out.println(countrySelected);
		
		}

	}


