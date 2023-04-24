package SelectClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownMultiselect {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("http://omayo.blogspot.com/");
	
	
	//multi select dropdown
	WebElement DropDown = driver.findElement(By.id("multiselect1"));
	Select sal=new Select(DropDown);
	sal.selectByIndex(0);
	sal.selectByValue("swiftx");
	sal.selectByVisibleText("Hyundai");
	Thread.sleep(3000);
//	
//	sal.deselectAll();
	
//	sal.deselectByIndex(0);
//	sal.deselectByValue("swiftx");
//	sal.deselectByVisibleText("Hyundai");

	
	
	
	
	
	
	
	}
}
