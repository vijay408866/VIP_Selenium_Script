package xpath;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class xpath5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp.loptop");
//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Brand']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Windows 10']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(3000);

		List<WebElement> laptopsPrices = driver.findElements(By.xpath(
				"//div[@class='_4rR01T']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		List<WebElement> laptopsNames = driver.findElements(By.xpath(
				"//div[@class='_4rR01T']"));
		
		for (int i = 0; i < laptopsPrices.size(); i++)
		{
			String Names = laptopsNames.get(i).getText();
			String price = laptopsPrices.get(i).getText();
			System.out.println(Names+ " " +price);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
