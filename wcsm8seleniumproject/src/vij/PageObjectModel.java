package vij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {

	WebDriver driver;
	
	PageObjectModel(WebDriver d)
	{
		driver=d;
	}
	
	By username= By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='pwd']");
	By loginButton= By.xpath("//a[@id='loginButton']");
	
	public void Username(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void Password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	
	public void Login()
	{
		driver.findElement(loginButton).click();
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
