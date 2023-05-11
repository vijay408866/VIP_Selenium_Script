package GetScreenShotMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TakeScreenShot3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/way3.jpg");
		Files.copy(src, dest);
	}
}
