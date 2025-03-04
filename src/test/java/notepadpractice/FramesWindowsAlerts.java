package notepadpractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesWindowsAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://testautomationpractice.blogspot.com/");
//		String parentwindow = driver.getWindowHandle();
//		WebElement popupBtn = driver.findElement(By.xpath("//button[@id='PopUp']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", popupBtn);
//		popupBtn.click();
//		Set<String> allwindows = driver.getWindowHandles();
//		for (String window : allwindows) {
////			if (window.getTitle().equals("Selenium")) {
////				driver.switchTo().window(window);
////				WebElement elemet = driver.findElement(By.xpath("//div[@class='row']/div/h2"));
////				System.out.println(elemet.getText());
////			}
//
//			 if(!window.equals(parentwindow)){
//			 driver.switchTo().window(window);
//			 WebElement elemet1 =
//			 driver.findElement(By.xpath("//div[@class='row']/div/h2"));
//			 System.out.println(elemet1.getText());
//			 }
//
//		}
		
		
		
	

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Frames.html");
			WebElement nestedframebtn= driver.findElement(By.xpath("//ul[@class='nav nav-tabs ']/li[2]"));
			nestedframebtn.click();
			WebElement firstframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
			driver.switchTo().frame(firstframe);

			WebElement insideframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			driver.switchTo().frame(insideframe);
			WebElement textbtn = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
			textbtn.sendKeys("bappa");
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			












			
	}
}
