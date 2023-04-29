package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssin {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
   driver.get("https://www.bluestone.com/");
   
   driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
   WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
   
   
   Actions act = new Actions(driver);
   
   act.moveToElement(target).perform();
   
   driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
   
   WebElement coine = driver.findElement(By.xpath("//div[@class='mousetrap']"));
   
   if(coine.isDisplayed())
   {
	 System.out.println("target is displayed");
   }
   else
   {
	System.out.println("terget is not displayed");
   }
}

}
