package mathadsOfWedDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class findElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		   WebElement pricemobaile = driver.findElement(By.xpath
		        ("(//div[@class='_4rR01T']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]"));	
	    System.out.println(pricemobaile.getText());
	}

	
	}