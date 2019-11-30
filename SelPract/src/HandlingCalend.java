import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCalend {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		WebElement month = driver.findElement(By.cssSelector("[class ='datepicker-days'] [class = 'datepicker-switch']"));
		String monthSelected = month.getText();
		while(!monthSelected.contains("December")){
			
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] th[class ='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
	    int count = dates.size();
	    
	    for(int i = 0; i<count; i++){
	    	
	    	String text = dates.get(i).getText();
	    	if(text.equals("25")){
	    		dates.get(i).click();
	    		break;
	    	}
	    		
	    	
	    	}
	    	
	    }

	}


