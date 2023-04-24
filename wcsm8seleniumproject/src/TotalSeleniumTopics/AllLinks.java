package TotalSeleniumTopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllLinks {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			String link = links.get(i).getAttribute("href");
			System.out.println("href : "+link);
		}
		
		driver.quit();
	}
}
