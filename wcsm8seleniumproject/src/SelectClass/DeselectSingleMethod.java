package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSingleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("http://omayo.blogspot.com/");
	WebElement dropdown = driver.findElement(By.id("drop1"));
	Select sal=new Select(dropdown);
	sal.selectByIndex(3);
	sal.deselectByIndex(3);
	     
	// in single select not posible deselect
	
	//  Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
			
	}

}
