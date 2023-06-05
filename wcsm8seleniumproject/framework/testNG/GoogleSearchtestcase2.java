package testNG;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleSearchtestcase2 extends Basetest {
  @Test
  public void testCase1() {
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test
  public void testCase2() {
	driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
  }
  @Test
  public void testCase() {
	 driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
