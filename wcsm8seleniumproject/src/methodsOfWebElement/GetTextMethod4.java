package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTextMethod4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=5blem8ujjihp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String button = driver.findElement(By.xpath("//a[text()='Login']")).getText();
	System.out.println(button);
	 
	
	}
}
