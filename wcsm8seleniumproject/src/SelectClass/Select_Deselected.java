package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("http://omayo.blogspot.com/");
	WebElement dropdown = driver.findElement(By.id("multiselect1"));
	Select sal=new Select(dropdown);
	for (int i = 0; i < 4; i++)
	{
	sal.selectByIndex(i);
	}
	for (int i = 0; i < 4; i++) 
	{
	sal.deselectByIndex(0);
	sal.deselectByValue("Hyundaix");
	sal.deselectByVisibleText("Swift");
	}
	}

}
