package com.atlasian.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2practice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//frames url
		//driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
//		driver.manage().window().maximize();
//		WebElement frame1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/iframe[1]"));
//		driver.switchTo().frame(frame1);
//		driver.findElement(By.xpath("/html/body/div/header/div[3]/a")).click();
		
		//alerts url
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
//		driver.switchTo().alert().accept();
		
		//dropdowns
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='comboBox']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		dropdown.click();
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dropdown']/div"));
		for(WebElement item:items) {
			String itemname = item.getText();
			if(itemname.equals("Item 50")) {
				item.click();
				break;
			}
		}
		//Select sl = new Select(dropdown);
		//sl.selectByVisibleText("Item 1");
		
		
		
		
	}

}
