package GetScreenShotMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.selenium.dev/");
	 
	 TakesScreenshot tc=(TakesScreenshot)driver;
	 File src = tc.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./ScreenShots/way1.jpg");
	 Files.copy(src, dest);
	 
	}
}
