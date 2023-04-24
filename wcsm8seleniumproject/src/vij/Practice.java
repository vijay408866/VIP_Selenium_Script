package vij;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-8ek7m7o/login.do");			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		PageObjectModel pg=new PageObjectModel(driver);
		pg.Username("admin");
		pg.Password("manager");
		pg.Login();
		
		
	}
}
