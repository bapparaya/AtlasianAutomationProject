package com.atlasian.qa.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {
	
      static void selectreqdate (WebDriver driver,String year,String month,String day)
      {
    		WebElement yeardp = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
    		WebElement monthdp = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		
    		Select selectmonth = new Select(monthdp);
    		
    		selectmonth.selectByVisibleText(month);
    		WebElement yearwait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-year']")));
    		Select selectyear = new Select(yearwait);
    		selectyear.selectByVisibleText(year);
    		
    		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td"));
    		
    		for(WebElement date:dates) {
    			
    			if(date.getText().equals(day)) {
    				date.click();
    			}
    		}
      }
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		String year = "2020";
		String month = "Feb";
		String day = "14";
		
		
		selectreqdate(driver,year,month,day);
	
		
		

	}

}
