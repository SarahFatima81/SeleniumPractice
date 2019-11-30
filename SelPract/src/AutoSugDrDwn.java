import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSugDrDwn {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("http://www.travelocity.com");
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		WebElement origin = driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']"));
		
		origin.sendKeys("O");
		Thread.sleep(2000L);
		origin.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
	    String script1 = "return document.getElementById(\"flight-origin-hp-flight\").value;";
	    String text1 = (String) jss.executeScript(script1);
	    System.out.println(text1);
		//origin.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("flight-destination-hp-flight"));
		destination.sendKeys("c");
		Thread.sleep(5000L);
		
		for(int i =1; i<9; i++)
			
		{
			destination.sendKeys(Keys.ARROW_DOWN);
			
			
		}
		
		    destination.sendKeys(Keys.ENTER);
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    String script = "return document.getElementById(\"flight-destination-hp-flight\").value;";
		    String text = (String) js.executeScript(script);
		    System.out.println(text);

	}
	          

}
