package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.dressEveningDress.PageObjectManagerEveningDress;
import com.dressSummerDress.PageObjectManagerSummerDress;

public class Dress_SummerDress  extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManagerSummerDress pom = new PageObjectManagerSummerDress(driver);

	public static void main(String[] args) {
		driver.get("http://automationpractice.com/index.php");
		// HomePage
		click(pom.getInstanceHP().getWomen());
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getInstanceHP().getDress());
		click(pom.getInstanceHP().getSummerDress());
		// add to cart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getInstanceATC().getInstock());
		click(pom.getInstanceATC().getAddtocart());
		click(pom.getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getInstancePP().getTextbox());
		sendkeys(pom.getInstancePP().getNofproduct(), "4");
		click(pom.getInstancePP().getCheckout2());
		// signInPage
		implicitWait(30, TimeUnit.SECONDS);
		sendkeys(pom.getInstanceSP().getEmail(), "vikey46@gmail.com");
		sendkeys(pom.getInstanceSP().getPassword(), "vikey@123");
		click(pom.getInstanceSP().getSignin());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceCPI().getAgree());
		click(pom.getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceFP().getConfirm());

		javaScriptExecutor();

	}
}
