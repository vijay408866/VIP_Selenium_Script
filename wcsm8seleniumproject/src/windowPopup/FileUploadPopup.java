package windowPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		//	Open Browser
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (ActiTime)
		driver.get("http://127.0.0.1/login.do;jsessionid=1d17jsj8cphjs");

		// Handle login page with valid inputs
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// HOME PAGE

		// click on Setting 

		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		//click on logo & color
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);
		// click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		// click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		// create obj of Actions Class
		Actions act = new Actions(driver);
		
		//  Use this method for DoubleClick....
		act.doubleClick(target).perform();
		Thread.sleep(2000);

		
		//To handle fileupload pop up 
		
	    File file = new File("./Autoit/vbscript.exe");
		String absulutpath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absulutpath);
		
		// close the browser
		driver.quit();






	}

}
