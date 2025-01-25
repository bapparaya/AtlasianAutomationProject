package com.atlasian.qa.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*select dropdowns
 * bootstrapdropdowns
 * hidden dropdowns
 * google search
 * 
 */
public class Dropdownsandautosuggestions {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://practice.expandtesting.com/dropdown");
		//driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		//driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//WebElement countries= driver.findElement(By.xpath("//select[@id='country']"));
		//Select dropvl= new Select(countries);
		//dropvl.selectByVisibleText("India");
		//System.out.println(countries.get(0));
		//dropvl.selectByIndex(1);
		//dropvl.selectByValue("BY");
		
		//List<WebElement> options = dropvl.getOptions();
		//System.out.println(options.size());
//		driver.findElement(By.xpath("//button[@id='menu1']")).click();
//		List<WebElement> values = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
//		System.out.println(values);
//		for(WebElement value:values) {
//			System.out.println(value.getText());
//			if(value.getText().equals("JavaScript")) {
//				value.click();
//				System.out.println("element is clicked");
//			}
//		}
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			
		
		

		
	
	}

}
