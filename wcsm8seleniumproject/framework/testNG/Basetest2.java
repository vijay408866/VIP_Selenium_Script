package testNG;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basetest2 {
  static WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdrivre.chrome.driver", "./drivers/chromedriver.exe");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
