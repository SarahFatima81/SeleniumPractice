import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ecomm {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
	   // WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		String [] itemsNeeded = {"Bolthouse Farms Peeled Baby Cut Carrots", "Romaine Lettuce Hearts","Zucchini"};
		int i= 0;
		
		
		driver.get("https://grocery.walmart.com/products?aisle=1255027787131_1255027789453");
		
		
		List<WebElement> itemsListed =  driver.findElements(By.cssSelector("div[data-automation-id = 'name']"));
		
		for(int j=0;j<itemsListed.size(); j++)
		{
			String [] itemName = itemsListed.get(j).getText().split(",");
			String actName = itemName[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(actName) )
			{
				
				driver.findElements(By.xpath("//div[@class = 'productTile__controlsContainerProductTile___EcgxG']")).get(j).click();
				i++;
				if(i==itemsNeeded.length)
				{
					break;
				}
			}
			
		}
		
	}

}
