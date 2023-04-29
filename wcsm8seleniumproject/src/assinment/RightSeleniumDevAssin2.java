  package assinment;

import java.awt.AWTException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightSeleniumDevAssin2 {
  public static void main(String[] args) throws InterruptedException, AWTException {
  System.setProperty("webdiver.chrome.driver", "./drivers/chromedriver.exe");
 
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://www.bluestone.com/");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
  WebElement target = driver.findElement(By.xpath("//span[text()='Solitaires ']"));
  
  Actions act = new Actions(driver);
  act.contextClick(target).perform();
  
  
  
  
  
  
}

}
