package assinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameBlueStoneAssin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
//		
//		driver.switchTo().frame(iframe);
		
		// using String or name
		driver.switchTo().frame("fc_widget");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		Thread.sleep(2000);
		
		// switch to control the default webpage
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("lov kush");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("lovkush@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("961446144");
		
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		
		Thread.sleep(5000);
	}

}
