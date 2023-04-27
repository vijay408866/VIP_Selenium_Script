package syncronaization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SyncronaizationWait2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("username")).sendKeys("vijay");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
	}
