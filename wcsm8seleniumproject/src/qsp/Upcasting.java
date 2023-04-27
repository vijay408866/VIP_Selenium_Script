package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upcasting {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("select The browser which u want to open: ");
		Scanner sc= new Scanner(System.in);
		String inputVal=sc.next();
		
		if(inputVal.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(inputVal.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(inputVal.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			 WebDriver driver = new EdgeDriver();
			 driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("enter the browser name");
		}
		
	}

}
