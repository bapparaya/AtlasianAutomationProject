package com.atlasian.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement pointme = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		Actions action = new Actions(driver);
		//action.moveToElement(pointme).moveToElement(laptop).build().perform();
		field1.clear();
		field1.sendKeys("bappa");
		action.doubleClick(doubleclick).perform();
		String field1value = field1.getAttribute("value");
		String field2value = field2.getAttribute("value");
		System.out.println(field1value);
		System.out.println(field2value);
		if(field1value.equals(field2value)) {
			System.out.println("test passed");
		}

	}

}
