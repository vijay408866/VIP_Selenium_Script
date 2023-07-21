package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	@FindBy(name = "username")
	private WebElement usernameTB;
	@FindBy(name = "pwd")
	private WebElement passwordTB;
	@FindBy(id = "loginButton")
	private WebElement loginBTN;

	public loginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getusernameTB() {
		return usernameTB;
	}

	public WebElement getpasswordTB() {
		return passwordTB;
	}

	public WebElement getloginBTN() {
		return loginBTN;
	}

	public void validlogin(String validusername, String validpassword) {
		usernameTB.sendKeys(validusername);
		passwordTB.sendKeys(validpassword);
		loginBTN.click();
	}

}
