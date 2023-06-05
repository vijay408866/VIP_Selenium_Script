package testNGmethodParalleE;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MathodParalleExicution {
	
	  @Test
	  public void methos1() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.google.co.in");
	     driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  }
	  @Test
	  public void methos2() {
		  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	     WebDriver driver=new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.google.co.in");
	     driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  }
//	  @Test
//	  public void methos3() {
//		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//	     WebDriver driver=new FirefoxDriver();
//	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	     driver.get("https://www.google.co.in");
//	     driver.switchTo().activeElement().sendKeys("",Keys.ENTER);
//	  }
	}
