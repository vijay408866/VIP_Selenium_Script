package ActionClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practic {
	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		Thread.sleep(2000);
		 Set<String>  allwindows= driver.getWindowHandles();
		 
		 Iterator<String>iterator=allwindows.iterator();
		 Thread.sleep(2000);
		 
		 String parentwindow=iterator.next();
		 String chaildwindow=iterator.next();
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(chaildwindow);
		 
		 Thread.sleep(2000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    Thread.sleep(4000);
	    jse.executeScript("window.scorllBy(0,500)");
	    
	   
        
		}
	}







