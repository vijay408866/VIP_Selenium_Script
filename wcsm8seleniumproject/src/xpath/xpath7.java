package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath7 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/?");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp.loptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[text()='Core i7']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();

	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Windows 10']")).click();
	Thread.sleep(3000);                                              //    xpath using axes

	 WebElement loptopprice = driver.findElement(By.xpath(      
			 "(//div[@class='_4rR01T']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")); // value
     WebElement loptopname = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));                        //name
     System.out.println(((WebElement) loptopname).getText());
     System.out.println(loptopprice);
}
}