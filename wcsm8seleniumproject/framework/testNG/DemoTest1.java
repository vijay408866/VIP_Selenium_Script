package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void e() {
	  Reporter.log("hey sql!!!",true);
  }
  @Test
  public void f() {
	 Reporter.log("f ",true);
  }
  
  @Test
  public void g() {
	Reporter.log("g method",true);  
  }
  
}
