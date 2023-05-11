package GetScreenShotMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShot4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		RemoteWebDriver tc = (RemoteWebDriver) driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/way4.jpg");
		Files.copy(src, dest);
		
		driver.close();
	}
}
