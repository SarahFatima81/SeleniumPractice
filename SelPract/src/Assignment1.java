import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
				//WebDriver driver = new FirefoxDriver();
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://qaclickacademy.com/practice.php");
				driver.findElement(By.id("checkBoxOption1")).click();
				/*System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
				Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
				driver.findElement(By.id("checkBoxOption1")).click();
				System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
				Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());*/
				System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
				
	}

}
