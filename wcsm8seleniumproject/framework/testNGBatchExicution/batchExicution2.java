package testNGBatchExicution;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class batchExicution2 {

	  @Test
	  public void methos2() {
		  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	     WebDriver driver=new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.google.co.in");
	     driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  }
	}
