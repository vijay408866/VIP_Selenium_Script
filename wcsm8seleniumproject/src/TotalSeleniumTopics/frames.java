package TotalSeleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ifrme = driver.findElement(By.id("iframeResult"));
		Thread.sleep(2000);
		driver.switchTo().frame(ifrme);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		//driver.quit();
	}
}
