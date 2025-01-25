package com.atlasian.qa.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		List urllist = new ArrayList();
		for(WebElement list:lists) {
			String url = list.getAttribute("href");
			try {
				URL urlobj = new URL(url);
				HttpURLConnection htp = (HttpURLConnection)new URL(url).openConnection();
				htp.setRequestMethod("HEAD");
				int rescode = htp.getResponseCode();
				if(rescode>=400) {
					System.out.println(url+" url is broken url");
					urllist.add(url);
				}else {
					System.out.println("it is a valid url");
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
System.out.println(urllist);
	}

}
