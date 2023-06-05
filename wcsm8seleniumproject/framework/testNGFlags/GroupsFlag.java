package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlag {
	
	@Test(groups = "")
	public void FT1()
	{
		Reporter.log("Fancnality testCase",true);
	}
}
