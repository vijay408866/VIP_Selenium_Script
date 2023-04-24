package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath2 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9373036380");
Thread.sleep(2000);

// xpath using multipal attribute
driver.findElement(By.xpath("//button[@type='button' and @class='submit-button'] ")).click();
Thread.sleep(2000);
driver.close();
}
}
