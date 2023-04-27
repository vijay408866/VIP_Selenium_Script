package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod12 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("username")).sendKeys("vijayshinde");
	driver.findElement(By.name("password")).sendKeys("7896541239");
	//driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']").click());
	
	driver.findElement(By.name("password")).submit();
}
}