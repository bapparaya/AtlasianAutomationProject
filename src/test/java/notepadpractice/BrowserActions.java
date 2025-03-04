package notepadpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {
		
				public static void main(String[] args){
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");;
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://github.com/login");
					String title = driver.getTitle();
					System.out.println(title);
					WebElement username = driver.findElement(By.xpath("//input[@id='login_field']"));
					System.out.println(username.isDisplayed());
					username.sendKeys("bappa");
					username.clear();
					username.sendKeys("muthu");
					String usernamevalue = username.getAttribute("value");
					System.out.println(usernamevalue);
					WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
					System.out.println(loginbtn.isEnabled());
					loginbtn.click();
					String textotherlogins = driver.findElement(By.xpath("//*[@id='login']/div[5]/webauthn-subtle/p/button/span/span")).getText();
					System.out.println(textotherlogins);

					}
	
	
	
	
}
