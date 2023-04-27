package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutSelect_Select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("http://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));

		Select sal = new Select(dropdown);
		List<WebElement> alloptions = sal.getOptions();
		
		for (int i = 0; i < alloptions.size(); i++) {
			WebElement we = alloptions.get(i);
			
			//System.out.println(option);
			if(we.getText().equals("Audi")) 
			{
				we.click();
			}
			else if(we.getText().equals("Volvo"))
			{
				we.click();
			}
			else if(we.getText().equals("Swift"))
			{
				we.click();
			}
			else if(we.getText().equals("Hyundai"))
			{
				we.click();
			}
			
			
			
			
			
		}
		
	
		
		

	}

}
