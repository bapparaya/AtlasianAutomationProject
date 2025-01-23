package com.atlasian.qa.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * https://blazedemo.com/
 */
public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//traverse table= //table[@name='BookTable']//tr[1]//th[1]
		//row= //table[@name='BookTable']//tr
		//column= //table[@name='BookTable']//tr//th
		
		int rowsize= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int columnsize = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println(rowsize);
		System.out.println(columnsize);
		
//		for(int r=2;r<=rowsize;r++) {
//			for(int c=1;c<=columnsize;c++) {
//				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"     ");
//			}
//			System.out.println("");
//		}
		List price = new ArrayList();
		//List price2 = new ArrayList();
		for(int r=2;r<=rowsize;r++) {
			
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				
				price.add(Integer.parseInt(value));
				//System.out.println(value+"     ");
				Collections.sort(price);
				
				
				//System.out.println(Integer.parseInt(value));
				
				if(price.get(0).equals(Integer.parseInt(value))){					
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText());
			}
		}
		
		System.out.println(price);
		System.out.println("================");
		System.out.println(price.get(0));
		
		//System.out.println(price);

		

	}

}
