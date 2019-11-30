import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C://Users//syed//Desktop//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
	
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click(); 
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		Select st = new Select(driver.findElement(By.id("Childrens")));
		st.selectByIndex(2);
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air India");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
