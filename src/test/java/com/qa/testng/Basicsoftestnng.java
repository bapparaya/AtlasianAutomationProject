package com.qa.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basicsoftestnng {

//@BeforeMethod
//void login() {
//	System.out.println("login");
//}

@Test(priority=2)
void HomePage() {
	System.out.println("checking home page");
	
}
@Test(priority=3)
void List() {
	System.out.println("checking listing page");
}

@Test(priority=1)
void cartpage() {
	System.out.println("checking cart page");
}

//@AfterMethod
//void logOut() {
//	System.out.println("logging out");
//}
}
