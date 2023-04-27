package syncronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWaitWait2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("username")).sendKeys("vijay");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	Thread.sleep(2000);
	}
	}
