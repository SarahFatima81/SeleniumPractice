import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Assignment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println("After Switching to Child Window");
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		driver.switchTo().window(parentId);
		
		System.out.println("After Switching Back to Parent Window");
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		

	}

}
