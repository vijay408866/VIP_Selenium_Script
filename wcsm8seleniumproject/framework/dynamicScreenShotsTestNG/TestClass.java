package dynamicScreenShotsTestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)


public class TestClass extends BaseTest{

	@Test
	public void firstTest()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Assert.fail();
		driver.findElement(By.id("loginButton")).click();
	}
	
}
