package com.atlasian.qa.test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//		TakesScreenshot sc = (TakesScreenshot)driver;
//		File fl = sc.getScreenshotAs(OutputType.FILE);
//		File target = new File("E:\\B1java\\AltasianTest\\src\\test\\java\\Screenshots\\amazon.png");
//		fl.renameTo(target);
		
		
		
		WebElement card = driver.findElement(By.xpath("//div[@id='desktop-grid-2']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(card));
	File source=card.getScreenshotAs(OutputType.FILE);
	File destin = new File("E:\\B1java\\AltasianTest\\src\\test\\java\\Screenshots\\amazoncard.png");
	source.renameTo(destin);
		

	}

}
