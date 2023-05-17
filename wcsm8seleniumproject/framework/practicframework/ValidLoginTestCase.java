package practicframework;


import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest3 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To open the browser Create the obj of BaseTest
		BaseTest3 bt = new BaseTest3();
		
		// read the data from property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertiesData(PROP_PATH,"username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertiesData(PROP_PATH,"password"));
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    bt.closeBrowser();
		
		
	}
	
	

}
