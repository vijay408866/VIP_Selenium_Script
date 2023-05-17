package practicframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest3 extends Flib implements IAutoConstnt2{
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException {
	Flib flib = new Flib();
   String browserValue = flib.readPropertiesData(PROP_PATH, "browser");
   String url = flib.readPropertiesData(PROP_PATH,"url");
   
   if (browserValue.equals("browser")) {
	   System.setProperty(CHROME_PATH,CHROME_KEY);
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get(url);
	}
	else if(browserValue.equals("Firefox"))
	{
		System.setProperty(GECKO_KEY,GECKO_PATH);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	else if(browserValue.equals("Edge"))
	{
		System.setProperty(EDGE_KEY,EDGE_PATH);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	else
	{
		System.out.println("Invalid BrowserValue!!!");
	}

}

public void closeBrowser()
{
	driver.quit();
	}

}
