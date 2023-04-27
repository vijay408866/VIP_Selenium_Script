package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//ChromeOptions co = new ChromeOptions();
//co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/?");
Thread.sleep(2000);

// xPath using single attribute
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vs408866");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1123");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='login']")).click();
Thread.sleep(2000);
}
}