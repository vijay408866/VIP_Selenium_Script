package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassnameLocator {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");
Thread.sleep(2000);
driver.switchTo().activeElement().sendKeys("Rossgller",Keys.ENTER);

// using classname locator
driver.findElement(By.className("INPNe")).click();
}
}
