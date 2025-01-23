package com.atlasian.qa.test;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrennshotpractice {

	public static void main(String[] args) {
		Logger logs = LogManager.getLogger("scrennshotpractice");
		logs.info("started==========");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		
//		TakesScreenshot sc =(TakesScreenshot)driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\brokenlink1.png");
//		source.renameTo(target);
//		System.out.println(System.getProperty("user.dir"));
		
		WebElement ele = driver.findElement(By.linkText("Hovers"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\brokenlinkhover.png");
		source.renameTo(target);
		}

}
