package com.atlasian.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atlasian.qa.pages.HomePage;
import com.atlasian.qa.pages.LoginPage;
import com.atlasian.qa.testbase.TestBase;
//bapparaya 12311
/*
 * This code is added to habdle conflicts 
 * This class is created by bapparaya to add login page testcases
 * This code is added to habdle conflicts part 2
 */
public class LoginPageTestCases extends TestBase {
     LoginPage loginpage;
     HomePage homepage;
   public LoginPageTestCases() {
	   super();
   }
   
   @BeforeMethod
   public void setUp() {
	   initialize();
	   loginpage= new LoginPage();
   }


@Test(priority=1)
public void verifyTitle() {
	String title= loginpage.getTitleOfthePage();
	Assert.assertEquals(title, "Log in with Atlassian account", "testcase pass");
}

@Test(priority=2)
public void verifylogin() throws InterruptedException {
	homepage = loginpage.clickOnLogin();
}


}
