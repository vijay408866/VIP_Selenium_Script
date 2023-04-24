package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NameLocator {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("http://desktop-8ek7m7o/login.do");
Thread.sleep(2000);

// using  name locator
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.id("loginButton")).click();
Thread.sleep(2000);
}
}
