package keyworddriven;


import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest2nd {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To open the browser Create the obj of BaseTest
		BaseTest2nd bt = new BaseTest2nd();
		
		// read the data from property file
		Flib1st flib = new Flib1st();
		
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    bt.closeBrowser();
		
		
	}
	
	

}
