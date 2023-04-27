package assinment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetDuplicet3 {
public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();

driver.get("file:///C:/Users/vs408/Documents/dropdown.html");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement DropDown = driver.findElement(By.name("menu"));

Select sal = new Select(DropDown);
List<WebElement> alloptions = sal.getOptions();

HashSet<String> hs = new HashSet<String>();

for (int i = 0; i <alloptions.size()  ; i++) 
{
       String op = alloptions.get(i).getText();	
       
       hs.add(op);
       
       for (String option:hs) {
    	   
    	   System.out.println(option);
		
	}
}
	
}
	
}

