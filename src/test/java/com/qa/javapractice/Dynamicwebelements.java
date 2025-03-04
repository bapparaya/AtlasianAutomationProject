package com.qa.javapractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dynamicwebelements {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
//		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='country']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", countrydropdown);
		Select sl = new Select(countrydropdown);
		//sl.selectByVisibleText("India");
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File fi = new File("E:\\B1java\\AltasianTest\\src\\test\\java\\com\\qa\\javapractice\\scrrenshot.png");
//		source.renameTo(fi);
		
		//sl.selectByValue("canada");
//		sl.selectByIndex(3);
//		Thread.sleep(1000);
//		sl.deselectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bappa");
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").pause(Duration.ofMillis(500)).keyUp(Keys.CONTROL)
		  .keyDown(Keys.CONTROL).sendKeys("c").pause(Duration.ofMillis(500)).keyUp(Keys.CONTROL)
		  .keyDown(Keys.CONTROL).sendKeys("v").pause(Duration.ofMillis(500)).keyUp(Keys.CONTROL)
		  .keyDown(Keys.CONTROL).sendKeys("v").pause(Duration.ofMillis(500)).keyUp(Keys.CONTROL)
		  .perform();
		
		
		
		

	}

}
