package vij;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit {
public static void main(String[] args) throws InterruptedException {	
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("http://omayo.blogspot.com/");
driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
Thread.sleep(2000);
driver.close();
}	
}
