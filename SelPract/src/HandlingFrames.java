import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		driver.get("https://jqueryui.com/droppable/");
		
	    //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class = 'demo-frame']")));
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    driver.switchTo().frame(0);
	    Actions a = new Actions(driver);
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	    
	    a.dragAndDrop(source, target).build().perform();
	    
	}

}
