package HybridFramework;

import java.io.IOException;

public class validlogin extends bestTest{

	public static void main(String[]args) throws IOException, InterruptedException {
		bestTest bt = new bestTest();
		bt.setup();
		loginPage lp = new loginPage(driver);
		flib fb = new flib();
		
		lp.validlogin(fb.readataProprtys(PROP_PATH,"username"),fb.readataProprtys(PROP_PATH,"password"));
		
		Thread.sleep(2000);
		
		bt.tearDown();
	}

}
