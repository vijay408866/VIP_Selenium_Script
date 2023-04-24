package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod11 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	boolean verifybutton = loginbutton.isEnabled();
	System.out.println(verifybutton);
	driver.findElement(By.name("username")).sendKeys("vijayshinde");
	driver.findElement(By.name("password")).sendKeys("7896541239");
	WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	boolean ibutton = button.isEnabled();
	System.out.println(ibutton);
	
}
}