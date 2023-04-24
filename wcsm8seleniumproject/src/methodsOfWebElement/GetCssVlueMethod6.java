package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssVlueMethod6 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String linehight = driver.findElement(By.xpath("//span[@id='home']")).getCssValue("line-height");
	System.out.println(linehight);
	}

}
