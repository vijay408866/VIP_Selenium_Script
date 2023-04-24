package vij;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllElements {

		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			String link= links.get(i).getAttribute("href");
			System.out.println(i+ "href : " + link);
		}
		
	}

}
