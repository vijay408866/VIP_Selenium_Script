package GetScreenShotMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShot5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/way5.jpg");
		Files.copy(src, dest);

		driver.close();
	}
}
