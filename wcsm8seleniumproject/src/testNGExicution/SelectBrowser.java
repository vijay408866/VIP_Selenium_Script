package testNGExicution;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class SelectBrowser {
	
	@Parameters({"browser","url"})
  @Test
  public void method1(String browser,String url) {
		if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.get(url);
		}
		else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver Driver=new EdgeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Driver.get(url);
		}
		else
		{
		System.out.println("invalid browser!!");
		}
  }
}
