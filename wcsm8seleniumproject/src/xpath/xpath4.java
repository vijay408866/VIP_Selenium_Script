package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath4 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.airindiaexpress.in/home?");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='INR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Indian Rupee']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(2000);
	
	// xpath using contains
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("9373036380");
	Thread.sleep(2000);
	
	// xpath using text()
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[@id='NonLoyalty']")).click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	}
}
