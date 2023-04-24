package mathadsOfWedDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	String scode=driver.getPageSource();
	System.out.println("scode");
	}

}
