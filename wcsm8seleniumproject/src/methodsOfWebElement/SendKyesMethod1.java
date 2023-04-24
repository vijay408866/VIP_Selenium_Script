package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKyesMethod1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=5blem8ujjihp");
	driver.findElement(By.name("username")).sendKeys("vijay");
	driver.findElement(By.name("pwd")).sendKeys("123");
	driver.close();
	}
}
