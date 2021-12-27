package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base_Class.Base_Class;
import com.blousesPOM.PageObjectManager_B;

public class Tops_Blouses extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManager_B pom = new PageObjectManager_B(driver);

	public static void main(String[] args) {
		driver.get("http://automationpractice.com/index.php");

		// HomePage
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getInstanceHP().getWomen());
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getInstanceHP().getTops());
		click(pom.getInstanceHP().getBlouse());
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
