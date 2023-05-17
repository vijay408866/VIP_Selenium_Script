package vij;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDataRead {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("./data/config.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String data = prop.getProperty("browser");
//		System.out.println(data);
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("broswer"));
	}
}
