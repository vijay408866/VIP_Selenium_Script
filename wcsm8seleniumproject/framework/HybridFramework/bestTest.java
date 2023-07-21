package HybridFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class bestTest extends flib implements iAutoit{
	
	static WebDriver driver;
	
	public void setup() throws IOException {
		
	flib fb = new flib();
	String browserValue = fb.readataProprtys(PROP_PATH, "browser");
	String url = fb.readataProprtys(PROP_PATH, "url");
	
	if(browserValue.equals("chrome")) {
		System.setProperty(chromeKey, chromePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	else if(browserValue.equals("edge")) {
		System.setProperty(edgeKey, edgePath);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	else
	{
		System.out.println("Invalid BrowserValue!!!");
	}
	}
	public void tearDown() {
		driver.close();
	}
	
}