import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C://Users//syed//Desktop//geckodriver.exe");
		
	    WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
	    driver.findElement(By.xpath("//*[@id='content']/ul/li[34]/a")).click();
	   
	    driver.switchTo().frame("frame-top");

	    driver.switchTo().frame("frame-middle");

	    System.out.println(driver.findElement(By.id("content")).getText());
	   
	   

	}
	
}
