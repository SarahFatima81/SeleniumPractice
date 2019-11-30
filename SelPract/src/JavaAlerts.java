import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
				WebDriver driver = new FirefoxDriver();
				// driver = new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				driver.findElement(By.id("name")).sendKeys("John");
				driver.findElement(By.id("alertbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				driver.findElement(By.id("confirmbtn")).click();
				driver.switchTo().alert().dismiss();

	}

}
