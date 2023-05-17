package keyworddriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest2nd{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest2nd bt = new BaseTest2nd();
		bt.openBrowser();
		
		Flib1st flib = new Flib1st();
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		for(int i=1;i<rc;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 0);
	    String invalidpassword = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 1);
	    
	    driver.findElement(By.name("username")).sendKeys(invalidusername);
	    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
	    driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	    
		}
		
		bt.closeBrowser();
	}

}

