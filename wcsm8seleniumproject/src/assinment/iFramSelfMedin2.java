package assinment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramSelfMedin2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/vs408/Documents/iframe.html");

		WebElement userWE = driver.findElement(By.id("i2"));
		userWE.sendKeys("vijay shinde");
		WebElement FrameW = driver.findElement(By.xpath("//iframe[@class='frcl']"));
		driver.switchTo().frame(FrameW);
		Thread.sleep(2000);
		WebElement pwdWE = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwdWE.sendKeys("6636966");
		Thread.sleep(2000);
		
		pwdWE.clear();
		
		driver.switchTo().defaultContent();
		
		userWE.clear();
		
		
	}

}
