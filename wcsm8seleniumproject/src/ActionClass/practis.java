package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class practis {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	   driver.get("https://www.bluestone.com/");
	   driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	   
	   
	}	
}
