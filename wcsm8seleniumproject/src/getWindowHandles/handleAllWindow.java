
package getWindowHandles;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class handleAllWindow {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.partialLinkText("SeleniumTutorial")).click();
		Thread.sleep(2000);
		Set<String> allwindow = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String>Iterator=allwindow.iterator();
		String parentwindow=Iterator.next();
		String chaildwindow = Iterator.next();
		
		driver.switchTo().window(chaildwindow);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,50)");
		
		WebElement salenium = driver.findElement(By.xpath("//img[@id='Header1_headerimg']"));
		
		File dest = salenium.getScreenshotAs(OutputType.FILE);
		
		File src = new File("./ScreenShots/v8.png");
		
		Files.copy(dest, src);
		
		
		
	}
}
