import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		    
		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\syed\\Desktop\\screenshot.png"));

	}

}
