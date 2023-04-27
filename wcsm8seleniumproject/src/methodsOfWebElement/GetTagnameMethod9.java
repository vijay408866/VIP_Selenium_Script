package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameMethod9 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebElement input = driver.findElement(By.xpath("//input[@value='Search']"));
    String Tagnamevalue = input.getTagName();
    System.out.println(Tagnamevalue);
	
	}

}
