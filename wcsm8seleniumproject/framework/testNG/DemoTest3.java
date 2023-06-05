package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void l() {
	  Reporter.log("l method!!!",true);
  }
  @Test
  public void m() {
	 Reporter.log("m method",true);
  }
  
  @Test
  public void b() {
	Reporter.log("b method",true);  
	int a=10;
	int j=5;
    int res=a/j;
  }
  
}
