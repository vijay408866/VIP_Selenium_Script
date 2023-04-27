package assinment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class assin2 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

EdgeOptions eo = new EdgeOptions();
eo.addArguments("--remote-allow-origins=*");
WebDriver driver = new EdgeDriver(eo);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/?");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobalis");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
Thread.sleep(2000);
List<WebElement> pricemobailes = driver.findElements(By.xpath(
		"//div[@class='_4rR01T']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1']"));

List<WebElement> mobailesnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

   for (int i = 0; i < pricemobailes.size(); i++) {
	    String prices = pricemobailes.get(i).getText();
	    String names = mobailesnames.get(1).getText();
	    System.out.println(prices+"  "+names);
	
}
   driver.close();
}

}
