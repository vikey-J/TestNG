package com.testng;

import org.testng.annotations.Test;

public class PriorityFeature {
	@Test(priority = 1)
	private void productPurchase() {
		System.out.println("product purchasing");
	}
	@Test(priority = 2)
	private void signIn() {
		System.out.println("SignIn successfully");
	}
	@Test(priority = 3)
	private void createNewAcc() {
		System.out.println("Create new Account Successfully");
	}
	@Test(priority = 4)
	private void confirmationCheck() {
		System.out.println("Dteails Confirmation checked");
	}
	@Test(priority = 5)
	private void paymentProcess() {
		System.out.println("payment Processs sucessfully");
	}
	@Test(priority = 6)
	private void purchaseSuccessfully() {
		System.out.println("purchsing Successfully");
	}

}
