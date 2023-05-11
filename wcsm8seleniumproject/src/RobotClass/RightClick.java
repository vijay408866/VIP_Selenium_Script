package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/");
    WebElement WED = driver.findElement(By.xpath("//span[text()='Downloads']"));
    Actions act = new Actions(driver);
    act.moveToElement(WED).perform();
    Thread.sleep(2000);
    Robot robot = new Robot();
    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    int i;
    for (i = 0; i < 11; i++) {
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
    if (i==11) {
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}

}

