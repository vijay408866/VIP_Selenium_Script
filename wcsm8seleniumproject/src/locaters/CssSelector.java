package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("vijay");
Thread.sleep(2000);
driver.findElement(By.name("password")).sendKeys("1234");
Thread.sleep(2000);

//using cssSelector
driver.findElement(By.cssSelector("button[class='_acan_acan_acas_aj1-']")).click();
Thread.sleep(2000);
}

}