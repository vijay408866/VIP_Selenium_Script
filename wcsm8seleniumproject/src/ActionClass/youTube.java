package ActionClass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTube {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://www.google.com/");

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("youtube.com", Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='tF2Cxc']/descendant::h3[text()='YouTube']")).click();

		driver.findElement(By.xpath("//ytd-searchbox[@id='search']")).sendKeys("vijay shinde all java keyword");
		Thread.sleep(2000);
		driver.findElement(
		   By.xpath("//button[@id='search-icon-legacy']/descendant::yt-icon[@class='style-scope ytd-searchbox']"))
		   .click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
	}
}