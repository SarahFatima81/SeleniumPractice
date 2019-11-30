import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksCount {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		WebElement navfooter =   driver.findElement(By.id("navFooter"));
		WebElement leftfooter = driver.findElement(By.xpath("//*[@id= 'navFooter']/div[1]/div/div[1]"));
		System.out.println(navfooter.findElements(By.tagName("a")).size());
		System.out.println(leftfooter.findElements(By.tagName("a")).size());
		
		for(int i = 0; i< (leftfooter.findElements(By.tagName("a")).size());i++)
				
				{
			     String clickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			    
			leftfooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			
			}
		
		Set<String> winds = driver.getWindowHandles(); 
		Iterator<String> it = winds.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	
	}

}
