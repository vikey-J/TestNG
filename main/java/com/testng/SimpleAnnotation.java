package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launched");
	}
	@BeforeClass
	private void urlLaunched() {
		System.out.println("Url Launched");
	}
	@BeforeMethod
	private void automationTestingStart() {
		System.out.println("Automation Testing Start");
	}
	@Test
	private void productPurchase() {
		System.out.println("product purchasing");
	}
	@Test
	private void signIn() {
		System.out.println("SignIn successfully");
	}
	@Test
	private void createNewAcc() {
		System.out.println("Create new Account Successfully");
	}
	@Test
	private void confirmationCheck() {
		System.out.println("Confirmation checked");
	}
	@Test
	private void paymentProcess() {
		System.out.println("payment Processs sucessfully");
	}
	@Test
	private void purchaseSuccessfully() {
		System.out.println("purchsing Successfully");
	}
	@AfterMethod
	private void AutomationTestingClosed() {
		System.out.println("Automation Testing Closed");
	}
	@AfterClass
	private void url_Closed() {
		System.out.println("url closed");
	}
	@AfterTest
	private void browserClosed() {
		System.out.println("Browser closed");
	}
	@AfterSuite
	private void closeSetProperty() {
		System.out.println("setPropery closed");
	}

}