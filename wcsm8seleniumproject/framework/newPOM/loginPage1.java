package newPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage1 {
	
	WebDriver driver;
	
	loginPage1(WebDriver d)
	{
	driver = d;
	}
	
	By userName=By.id("user-name");
	By passWord=By.id("password");
	By loginBtn=By.id("login-button");
    
	
	public void enterusername(String uname)
	{
	driver.findElement(userName).sendKeys(uname);
	}
	
	public void enterpassword(String pwd)
	{
	driver.findElement(passWord).sendKeys(pwd);
	}
	
	public void loginclick()
	{
		driver.findElement(loginBtn).click();
	}
}
