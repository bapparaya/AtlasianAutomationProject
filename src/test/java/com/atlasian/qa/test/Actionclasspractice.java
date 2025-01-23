package com.atlasian.qa.test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclasspractice {

	public static void main(String[] args) {
		Logger logs = LogManager.getLogger();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		logs.info("opening the browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions action = new Actions(driver);
		/*WebElement element = driver.findElement(By.xpath("//button[text()='Point Me']"));
		action.moveToElement(element).perform();
		WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
		laptop.click();*/
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", slider);
		action.clickAndHold(slider).moveByOffset(100, 0).release().perform();
		

	}

}
