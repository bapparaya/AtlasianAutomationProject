package com.qa.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.qa.testng.Mylistner.class)
public class Listners {
    WebDriver driver;
    
    
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	
	@Test
	void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div/span/h6")).getText();
		Assert.assertEquals(title, "Dashboard");
		
	}
	
	@Test(dependsOnMethods="login")
	void verifyDashbpard() {
		String title = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div/span/h6")).getText();
		Assert.assertEquals(title, "Dashboard");
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}




}
