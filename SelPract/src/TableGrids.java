import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableGrids {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		int sum = 0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23435/nam-vs-ken-33rd-match-group-a-icc-mens-t20-world-cup-qualifier-2019");
        WebElement table = driver.findElement(By.cssSelector("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        List<WebElement> scoreCard = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
        int score = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        
        for(int i =0; i<score-2; i++){
        	
        	System.out.println(scoreCard.get(i).getText());
        	String runs = scoreCard.get(i).getText();
        	int runsValue = Integer.parseInt(runs);
        	sum = sum+runsValue;
        	
        	
        }
        System.out.println(sum);
        
		System.out.println(driver.findElement(By.xpath("//*[text() = 'Extras']/following-sibling::div")).getText());
		String extras = (driver.findElement(By.xpath("//*[text() = 'Extras']/following-sibling::div")).getText());
		int extrasValue = Integer.parseInt(extras);
		int total = sum+extrasValue;
		System.out.println(total);
		
		String actualTot = driver.findElement(By.xpath("//*[text() = 'Total']/following-sibling::div")).getText();
		System.out.println(actualTot);
		int actualTotal = Integer.parseInt(actualTot);
		
		
		if(actualTotal == total){
			
			System.out.println("Count matches");
			
			}
		else{
			System.out.println("Count does not match");
		}
	}

}
