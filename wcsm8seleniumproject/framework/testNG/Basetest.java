package testNG;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basetest {
	static WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com");
	    
  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
