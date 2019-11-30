import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
            
		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement hover = driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(hover).build().perform();
		
		WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		a.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
