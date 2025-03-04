package notepadpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownsMouseactions {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='country']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", countrydropdown);
//		Select sl = new Select(countrydropdown);
		//sl.selectByVisibleText("India");
		//sl.selectByIndex(1);
		//sl.selectByValue("canada");
		
//		WebElement pointtome = driver.findElement(By.xpath("//button[text()='Point Me']"));
//		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions action = new Actions(driver);
//		action.moveToElement(pointtome).perform();
//		mobile.click();
		//WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		//action.doubleClick(doubleclick).perform();
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.click();
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		field2.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		



		}
}
