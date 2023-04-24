package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearMethod3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=5blem8ujjihp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement usernameTB = driver.findElement(By.name("username"));
	 WebElement passwordTB = driver.findElement(By.name("pwd"));
	 usernameTB.sendKeys("vijay");
	 Thread.sleep(2000);
	 passwordTB.sendKeys("123");
	 Thread.sleep(2000);
	 usernameTB.clear();
	 Thread.sleep(2000);
	 passwordTB.clear();
	 
	
	}
}
