package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod8 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebElement input = driver.findElement(By.xpath("//input[@value='Search']"));
    Rectangle rect = input.getRect();
    int xaxis=rect.getX();
    int yaxis=rect.getY();
	System.out.println("x axis : "+xaxis+" : y axis :" +yaxis);
	int h=rect.getHeight();
	int w=rect.getWidth();
	System.out.println("Height :"+h+" Width :" +w);
	
	}

}
