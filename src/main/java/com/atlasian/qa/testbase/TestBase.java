package com.atlasian.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		
		try {
			prop = new Properties();
			//("user.dir") + "/resources/testdata.csv"
			FileInputStream ip = new FileInputStream(("user.dir")+ "AltasianTest\\src\\main\\java\\com\\atlasian\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
		

	
public void initialize(){
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.get(prop.getProperty("url"));
	
}
	





}
