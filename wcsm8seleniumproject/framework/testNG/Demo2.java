package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void f() {
	  Reporter.log("hey java!!!",true);
  }
}
