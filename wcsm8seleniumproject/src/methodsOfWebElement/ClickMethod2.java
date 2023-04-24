package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickMethod2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=5blem8ujjihp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("username")).sendKeys("vijay");
	driver.findElement(By.name("pwd")).sendKeys("123");
	driver.findElement(By.id("loginButton")).click();
	}
}
