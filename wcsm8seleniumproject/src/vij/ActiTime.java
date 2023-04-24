package vij;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://desktop-8ek7m7o/login.do");			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		if(driver.getTitle().equals("actiTIME - Login"))
		{

			PageObjectModel pg=new PageObjectModel(driver);
			pg.Username("admin");
			pg.Password("manager");
			pg.Login();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("title")));
			
			if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
			{
				System.out.println("HomePage Title Matched");
			}
			else {
				System.out.println("HomePage Title Not Matched");
			}
			
		}
		else {
			System.out.println("Login Title is not Matched");
		}
		
		driver.quit();
		
		
	}

}
