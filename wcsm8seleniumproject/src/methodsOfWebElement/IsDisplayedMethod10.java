package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayedMethod10 {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=5blem8ujjihp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement username = driver.findElement(By.name("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement button = driver.findElement(By.id("loginButton"));
	if (username.isDisplayed())
	{            //---------
	username.sendKeys("vijay");
	}
	else
	{
	System.out.println("will get exception");
	}
	if(password.isDisplayed())
	{          //----------
	password.sendKeys("4321");
	}
	else
	{
	System.out.println("will get exception");
	}
	if(button.isDisplayed())
	{        //---------
	button.click();
	}
	else
	{
	System.out.println("will get exception");
	}
	}
	}