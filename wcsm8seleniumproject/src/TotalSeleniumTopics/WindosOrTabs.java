package TotalSeleniumTopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindosOrTabs {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//div[@class='btn-container  '])[1]")).click();
		
		Set<String> myallwindows = driver.getWindowHandles();
		//System.out.println(myallwindows);
		
		Iterator<String> iterate = myallwindows.iterator();
		String parentwindow = iterate.next();
		String childwindow = iterate.next();
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Shinde");
		
		//driver.quit();
	}
}
