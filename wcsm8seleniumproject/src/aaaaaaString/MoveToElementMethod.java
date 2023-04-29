package aaaaaaString;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) {
			
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/downloads/");			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			WebElement jrs = driver.findElement(By.partialLinkText("4.9.0"));
			
			Actions action=new Actions(driver);
			
			// MOVE TO CARSER
			
			action.moveToElement(jrs).perform();
			
	}			//MoveToElementMethod   DoubleClickMethod2
}