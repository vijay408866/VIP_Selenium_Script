package assinment;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandls {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sumsung galaxy s23ultra");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		
		Set<String> chiledwindow = driver.getWindowHandles();
		for (String wh:chiledwindow) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='swatch-1-storage']")).click();
		
		WebElement pinCode = driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
		Thread.sleep(2000);
		pinCode.sendKeys("412110");
		pinCode.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement removeB = driver.findElement(By.xpath("//div[text()='Remove']"));
		Point p1 = removeB.getLocation();
		int xaxis = p1.getX();
	    int yaxis = p1.getY();
	    jse.executeScript("Window.scrollBy("+xaxis+","+yaxis+")");
	    
		Thread.sleep(2000);
		removeB.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	}

}
