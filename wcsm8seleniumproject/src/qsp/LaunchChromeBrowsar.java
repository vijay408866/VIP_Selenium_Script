package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowsar {

	public static void main(String[] args) {	
		//to launch chrome Broswer
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  // illigalsetexseption
      new ChromeDriver();
      
     // System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//	new FirefoxDriver();
      
      
     // System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	//	new EdgeDriver();
	}

}
