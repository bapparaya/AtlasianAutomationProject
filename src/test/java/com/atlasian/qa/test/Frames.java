package com.atlasian.qa.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().window().maximize();
		String parentwn=driver.getWindowHandle();
		WebElement frlink = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/iframe[1]"));
				
		driver.switchTo().frame(frlink);
		driver.findElement(By.xpath("/html/body/div/header/div[3]/a")).click();
		
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement frame2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/iframe[2]"));
		driver.switchTo().frame(frame2);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		
		Set<String> windids=driver.getWindowHandles();
		
		for(String wd:windids) {
			if(!wd.equals(parentwn)) {
				driver.switchTo().window(wd);
				System.out.println(driver.getTitle());
			}
		}
		
		
		
		
	}

}
