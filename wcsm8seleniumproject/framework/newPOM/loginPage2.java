package newPOM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {
	
	WebDriver driver;
	
	loginPage2(WebDriver d)
	{
	driver = d;
	
	PageFactory.initElements(driver,this);
	}
	@FindBy(id ="username")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement loginbtn;
	
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterpassword(String pwd)
	{
	password.sendKeys(pwd);
	}
	public void loginbtnclick()
	{
	loginbtn.click();
	}

}
