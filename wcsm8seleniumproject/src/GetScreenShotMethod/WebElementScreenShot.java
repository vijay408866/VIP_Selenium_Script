package GetScreenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class WebElementScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.get("https://www.instagram.com/accounts/login/");
		WebElement button = Driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		
		if (button.isEnabled()) {
			System.out.println("we can do the login");
		} else {
			System.out.println("we can not do login! ss is takes");
			
			File src = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/WE.png");
			
			Files.copy(src, dest);

		}
		
		Driver.close();
	}

}
