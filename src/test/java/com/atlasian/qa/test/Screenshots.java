package com.atlasian.qa.test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshots {

	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\fullscreenshot.png");
//		System.out.println(System.getProperty("user.dir"));
//		//FileUtils.copyFile(source, target);
//		source.renameTo(target);
		
		WebElement table = driver.findElement(By.xpath("//div[@id='HTML1']"));
		File source = table.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\table.png");
		source.renameTo(target);		
		
	}

}
