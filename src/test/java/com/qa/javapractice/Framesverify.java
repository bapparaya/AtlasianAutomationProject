package com.qa.javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesverify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//form[@id='id3']/div/input")).sendKeys("bappa");
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

	}

}
