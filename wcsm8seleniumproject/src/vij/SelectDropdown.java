package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// multi select dropdown
		WebElement multi = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select obj=new Select(multi);
		obj.selectByIndex(3);
		obj.selectByValue("volvox");
		obj.selectByVisibleText("Swift");
		
		String str= multi.getAttribute("id");
		System.out.println(str);
		
		// singal select dropdown
		WebElement single = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select obj1=new Select(single);
		obj1.selectByIndex(2);
		
		String str1= single.getAttribute("class");
		System.out.println(str1);
	}

}
