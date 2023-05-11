package takeScreenShot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
        
        TakesScreenshot tc=(TakesScreenshot)driver;
        
        File src = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/vj1.png");
		
		Files.copy(src, dest);
	}
}
