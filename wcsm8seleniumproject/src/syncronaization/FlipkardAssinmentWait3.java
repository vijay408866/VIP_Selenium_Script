package syncronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class FlipkardAssinmentWait3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(2000);
	driver.quit();
	}
	}
