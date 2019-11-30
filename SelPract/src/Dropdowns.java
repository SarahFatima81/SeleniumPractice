import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'HYD']")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("(//a[@value = 'BOM'])[2]")).click();
		driver.findElement(By.xpath("(//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'BOM'])")).click();
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        driver.findElement(By.xpath("//*[@id= 'ui-datepicker-div']/div[1]/table/tbody/tr[1]/td[7]/a")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        
        
        
        {
        	System.out.println("Is Disabled");
        	Assert.assertTrue(true);
        }
        else{
        	System.out.println("Is Enabled");
        	Assert.assertFalse(false);
        }
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i =1; i<9;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "9 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByValue("USD");
		Thread.sleep(3000L);
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}
	

}
