package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=1d17jsj8cphjs");
		
		// to read the data from external files create the obj of flib 
		
		   Flib flib = new Flib();

		   driver.findElement(By.name("username")).sendKeys( flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1, 0));
		   Thread.sleep(2000);
		   
		   driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1, 1));
		   
		   driver.findElement(By.id("loginButton")).click();
		   Thread.sleep(2000);
		   driver.quit();
		
		

	}

}
