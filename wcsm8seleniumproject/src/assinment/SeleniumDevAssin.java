  package assinment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumDevAssin {
  public static void main(String[] args) throws InterruptedException, AWTException {
  System.setProperty("webdiver.chrome.driver", "./drivers/chromedriver.exe");
 
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://www.bluestone.com/");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
  WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
  
  Actions act = new Actions(driver);
  act.moveToElement(target).perform();
  driver.findElement(By.xpath("//a[text()='Band']")).click();
  
  WebElement wb = driver.findElement(By.xpath("//div[text()='Filter by']"));
  Thread.sleep(2000);
  for (int i = 0; i < 2; i++) {
	  
	act.clickAndHold(wb).perform();
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_CONTROL);
}
  
}

}
