package TotalSeleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement multidropdown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multidropdown);
		select.selectByIndex(1);
		select.selectByVisibleText("Audi");
		select.selectByValue("Hyundaix");
		
		
		WebElement singledropdown = driver.findElement(By.id("drop1"));
		Select select1 = new Select(singledropdown);
		select1.selectByIndex(0);
		Thread.sleep(2000);
		select1.selectByVisibleText("doc 4");
		Thread.sleep(2000);
		select1.selectByValue("ghi");
		Thread.sleep(2000);
		
		

	}
}
