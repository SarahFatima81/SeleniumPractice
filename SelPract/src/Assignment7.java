import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//*[@id='product']/tbody"));
		int rowCount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowCount);
		int columnCount = driver.findElements(By.xpath("//*[@id='product']/tbody/tr[1]/th")).size();
		System.out.println(columnCount);
		System.out.println(driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]")).getText());
		

	}

}
