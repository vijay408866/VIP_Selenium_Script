package mathadsOfWedDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateANDSwitchtoMethod {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
//will launch application with the help of navigate method
driver.navigate().to("https://www.google.com/");
Thread.sleep(2000);
//switch the activeElements
driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.quit();
}
}