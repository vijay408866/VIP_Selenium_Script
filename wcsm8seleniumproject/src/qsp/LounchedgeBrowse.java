package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LounchedgeBrowse {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		new EdgeDriver();
		

	}

}
