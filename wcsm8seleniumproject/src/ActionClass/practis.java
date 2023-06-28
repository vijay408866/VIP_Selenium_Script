package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class practis {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		WebElement wbe= driver.findElement(By.xpath("//input[@id='sa']"));
		File src = wbe.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots/n3.png");
		Files.copy(src, dest);
	}
}