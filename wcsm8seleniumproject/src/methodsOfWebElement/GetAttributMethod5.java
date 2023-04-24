package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributMethod5 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://omayo.blogspot.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement value = driver.findElement(By.xpath("//input[@class='gsc-search-button']"));
String classvalue = value.getAttribute("class");
System.out.println(classvalue);
}

}
