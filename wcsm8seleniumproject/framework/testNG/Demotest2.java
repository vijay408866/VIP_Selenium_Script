package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demotest2 {
  @Test
  public void h() {
	  Reporter.log("h method!!!",true);
  }
  @Test
  public void j() {
	 Reporter.log("j method",true);
  }
  
  @Test
  public void k() {
	Reporter.log("k method",true);  
  }
  
}
