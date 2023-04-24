package mathadsOfWedDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitalMethod {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	String loginPageTitle=driver.getTitle();
	System.out.println(loginPageTitle);
	}

}
