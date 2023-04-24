package TotalSeleniumTopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ifrme = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(ifrme);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.quit();
	}
}
