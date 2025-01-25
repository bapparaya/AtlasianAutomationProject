package com.atlasian.qa.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count =0;
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			//System.out.println(url);
			try {
			URL urls = new URL(url);
			HttpURLConnection htpurlcon = (HttpURLConnection)urls.openConnection();
			htpurlcon.setRequestMethod("HEAD");
			htpurlcon.connect();
			int responsecode = htpurlcon.getResponseCode();
			
			if(responsecode>=400) {
				System.out.println(url +"it is a broken link");
				count++;
			}else
			{
				System.out.println(url +"it is valid link");
			}
			
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(count);
	}

}
