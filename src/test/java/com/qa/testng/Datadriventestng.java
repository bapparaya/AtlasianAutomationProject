package com.qa.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datadriventestng {
	WebDriver driver;

@Parameters({"browser"})
@BeforeMethod
void setup(String browser) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
//(dataProvider="dp")
//String username, String password
@Test
void loginTest() {
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String title = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div/span/h6")).getText();
	Assert.assertEquals(title, "Dashboard");
}

//@DataProvider(name="dp")
//Object[][] testdata() {
//	Object [][] data = {{"Admin", "bryan"},
//			{"Devops","bappa"},
//			{"QA","beppa"},
//			{"Admin","admin123"}
//		   };
//	return data;
//}

@AfterMethod
void teardown() {
	driver.close();
}















}
