package com.atlasian.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Selenium");
		int listsize=driver.findElements(By.xpath("//*[@role=\"option\"]//div[1]/span")).size();
		System.out.println(listsize);
		for(int i=1;i<=listsize;i++) {
			System.out.println("insise the loop");
			System.out.println(driver.findElement(By.xpath("//*[@role=\"option\"]//div[1]/span")).getText());
		}

	}

}
