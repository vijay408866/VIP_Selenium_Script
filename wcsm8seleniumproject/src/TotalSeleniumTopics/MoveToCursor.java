package TotalSeleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToCursor {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement electronic = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(electronic).perform();
		
		
		
	}
}
