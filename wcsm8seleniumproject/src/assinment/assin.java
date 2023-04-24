package assinment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assin {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
    WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	Dimension targetsize =new Dimension(350,450);
	Thread.sleep(2000);
	driver.manage().window().setSize(targetsize);
	Point targetPosition=new Point(450,350);
	Thread.sleep(2000);
	driver.manage().window().setPosition(targetPosition);
	driver.close();

}
}