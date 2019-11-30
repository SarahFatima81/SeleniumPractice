import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultWin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://outlook.live.com/owa/");
		
	    driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[1]/a")).click();
	    
	    System.out.println("Before Switching");
	    System.out.println(driver.getTitle());
	    
	    Set<String> ids = driver.getWindowHandles();
	    Iterator<String> it = ids.iterator();
	    String parentId = it.next();
	    String childId = it.next();
	    
	    driver.switchTo().window(childId);
	    
	    System.out.println("After Switching");
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(parentId);
	    
	    System.out.println("After Reswitching");
	    
	    System.out.println(driver.getTitle());
	    

	}

}
