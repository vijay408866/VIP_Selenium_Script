package WebBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCanfarmetionPopUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vs408/Documents/ConfirmPopUp.html");

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='input']")).click();
		
		Alert al = driver.switchTo().alert();
		//al.accept();
		//
		al.dismiss();
		System.out.println(al.getText());
		
		

}
}
