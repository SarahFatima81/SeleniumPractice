import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		driver.get("http://www.hotmail.com");
		driver.findElement(By.cssSelector("a[data-task = 'signin']")).click();
		
		driver.findElement(By.cssSelector("#i0116")).sendKeys("safa79us@hotmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Gardenfresh2008");
		driver.findElement(By.cssSelector("input[id = 'idSIButton9']")).click();
		
		String expcttitle = "Outlook Mail";
		String acttitle = driver.getTitle();
		
		if(expcttitle.equals(acttitle))
			
			{
			System.out.println("Pass");
			}
		else
		{
			System.out.println("Fail");

	}

	}
}
