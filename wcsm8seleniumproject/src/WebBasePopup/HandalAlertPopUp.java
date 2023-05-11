package WebBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandalAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/vs408/Documents/AlertPopUp.html");
		
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());
		//al.sendKeys(null);
}
}