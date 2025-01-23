package com.atlasian.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutorpractice {

	public static void main(String[] args) {
		// click, scrolling
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement some = driver.findElement(By.linkText("Context Menu"));
		//js.executeScript("arguments[0].click();", some);
		//WebElement ele = driver.findElement(By.linkText("Hovers"));
		
		//js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		//js.executeScript("window.scrollBy(0,100)");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		

	}

}
