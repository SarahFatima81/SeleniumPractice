import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//syed//Desktop//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement optionSelected = driver.findElement(By.xpath("//*[text() = 'Option2']"));
		System.out.println(optionSelected.getText());
		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		optionSelected.click();
		
		String text = optionSelected.getText();
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alert = driver.switchTo().alert().getText();
		
		System.out.println(alert);
		
		System.out.println(alert.contains(text));
		
	   
	
	}

}
