package com.atlasian.qa.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		
		String reqmonthyear = "MAR 2025";
		String reqdate = "13";
		
		//System.out.println(reqmonthyear);
		
		
		Thread.sleep(5000);
		while(true) {
			String currentmonthyear = driver.findElement(By.xpath("//*[@id=\"dvcalendar\"]/div/div[1]/div/div[1]/div[2]")).getText();
			
			if(reqmonthyear.equals(currentmonthyear)) {
				break;
			}
			driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='box']//div[@class='days']//ul/li"));
		
		for(WebElement day:days) {
			String fullText = day.getText().trim(); // This will include both date and price
		    String price = day.findElement(By.tagName("span")).getText().trim(); // Get the price text
		    
		    // Remove price from full text to isolate the date
		    String targetdate = fullText.replace(price, "").trim();
			System.out.println("target date"+ targetdate);
			if(targetdate.equals(reqdate)) {
				System.out.println("reqdate");
				day.click();
			}
		}

	}

}
