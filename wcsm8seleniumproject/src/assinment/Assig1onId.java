  package assinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Assig1onId {
  public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdiver.edge.driver", "./drivers/msedgedriver.exe");
 
  WebDriver driver = new EdgeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.netflix.com/in/Login/");
  Thread.sleep(2000);
  driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@123");
  Thread.sleep(2000);
  driver.findElement(By.id("id_password")).sendKeys("1234asdfg");
  driver.findElement(By.xpath("//button[text()='sigh In']")).click();
}

}
