package testngfailedcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Failedtestcases {

@BeforeClass
void setUP() {
	System.out.println("before method setup all browser");
}

@Test(priority=1)
void verifyLogin() {
	Assert.assertTrue(true);
}

@Test(priority=2)
void verifyHomepage() {
Assert.assertTrue(true);	
}

@AfterClass
void tearDown() {
	System.out.println("close everything");
}







}
