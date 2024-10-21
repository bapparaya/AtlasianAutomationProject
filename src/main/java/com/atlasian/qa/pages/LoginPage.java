package com.atlasian.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlasian.qa.testbase.TestBase;

public class LoginPage extends TestBase {

@FindBy(id="username")
WebElement username;

@FindBy(id="login-submit")
WebElement submit;

@FindBy(id="social-login-submit")
WebElement continuewithgoogle;

public LoginPage() {
	PageFactory.initElements(driver, this);
}

public String getTitleOfthePage() {
	return driver.getTitle();
}

public HomePage clickOnLogin() throws InterruptedException {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	Thread.sleep(10000);
	username.sendKeys(prop.getProperty("email"));
	submit.click();
	Thread.sleep(5000);
	continuewithgoogle.click();
	return new HomePage();
}





}
