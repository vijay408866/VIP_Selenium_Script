package getWindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		// perform max action on chiled window
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omayo.blogspot.com/");

		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		Point loc = link.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
        Thread.sleep(2000);
		//  address of parent windows
        String parentWindow = driver.getWindowHandle();
        
		link.click();
		Thread.sleep(4000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String wh : allWindows) {
			if(parentWindow.equals(wh))
			{
			driver.switchTo().window(wh).manage().window().maximize();
			}
			else
			{
			driver.close();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
