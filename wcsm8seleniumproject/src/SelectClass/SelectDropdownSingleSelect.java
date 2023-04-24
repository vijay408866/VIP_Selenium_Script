package SelectClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownSingleSelect {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("http://omayo.blogspot.com/");
	
	
	WebElement DropDown = driver.findElement(By.id("drop1"));
	Select sal=new Select(DropDown);
	sal.selectByIndex(0);
	sal.selectByValue("ghi");
	sal.selectByVisibleText("doc 4");
	Thread.sleep(3000);
	
	sal.deselectAll();
	
//sal.deselectByIndex(0);
//	sal.deselectByValue("swiftx");
//	sal.deselectByVisibleText("doc 4");
	
	//Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
	

	
	
	
	
	
	
	
	}
}
