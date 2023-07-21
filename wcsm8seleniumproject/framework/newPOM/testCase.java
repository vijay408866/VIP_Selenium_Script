package newPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase{



	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/v1/");
	
		
	
		loginPage2 loginpg=new loginPage2(driver);
		
		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.loginbtnclick();
	}

}