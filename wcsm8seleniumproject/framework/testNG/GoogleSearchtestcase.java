package testNG;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchtestcase extends Basetest {
  @Test
  public void search() {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test
  public void search1() {
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
  }
  @Test
  public void search2() {
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
