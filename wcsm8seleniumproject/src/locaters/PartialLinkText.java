package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinkText {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/vs408/Documents/Link.html");
Thread.sleep(2000);

// partiallLinkText using locators
driver.findElement(By.partialLinkText("flipkart")).click();
Thread.sleep(2000);
}	

}