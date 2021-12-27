package com.testNG_Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base_Class.Base_Class;
import com.women_POManager.PageObjectManager;

public class TestNG_AutomationPractice extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);

	@BeforeClass
	public void url_Launch() throws Throwable {
		implicitWait(10, TimeUnit.SECONDS);
		url("http://automationpractice.com/index.php");
	}

	@BeforeMethod
	public void Signin() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceSP().getLogin());
		sendkeys(pom.getPOM1().getInstanceSP().getEmail(), "vikey46@gmail.com");
		sendkeys(pom.getPOM1().getInstanceSP().getPassword(), "vikey@123");
		click(pom.getPOM1().getInstanceSP().getSignin());
	}

	@Test(groups = "Tops",priority = -2)
	public void purchase_Tshirt() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceHP().getWomen());
		click(pom.getPOM1().getInstanceHP().getTops());
		click(pom.getPOM1().getInstanceHP().getTshirt());
		// AddToCart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getPOM1().getInstanceATC().getInstock());
		click(pom.getPOM1().getInstanceATC().getAddtocart());
		click(pom.getPOM1().getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getPOM1().getInstancePP().getTextbox());
		sendkeys(pom.getPOM1().getInstancePP().getNofproduct(), "4");
		click(pom.getPOM1().getInstancePP().getCheckout2());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceCPI().getAgree());
		click(pom.getPOM1().getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceFP().getConfirm());
		javaScriptExecutor();
	}

	@Test(groups = "Tops",priority = -1)
	public void purchase_Blouses() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM2().getInstanceHP().getWomen());
		click(pom.getPOM2().getInstanceHP().getTops());
		click(pom.getPOM2().getInstanceHP().getBlouse());
		// AddToCart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getPOM2().getInstanceATC().getInstock());
		click(pom.getPOM2().getInstanceATC().getAddtocart());
		click(pom.getPOM2().getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getPOM2().getInstancePP().getTextbox());
		sendkeys(pom.getPOM2().getInstancePP().getNofproduct(), "4");
		click(pom.getPOM2().getInstancePP().getCheckout2());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM2().getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM2().getInstanceCPI().getAgree());
		click(pom.getPOM2().getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM2().getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM2().getInstanceFP().getConfirm());
		javaScriptExecutor();
	}

	@Test(groups = "Dresses",priority = 0)
	public void purchase_CasualDress() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM3().getInstanceHP().getWomen());
		click(pom.getPOM3().getInstanceHP().getDress());
		click(pom.getPOM3().getInstanceHP().getCasualDress());
		// AddToCart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getPOM3().getInstanceATC().getInstock());
		click(pom.getPOM3().getInstanceATC().getAddtocart());
		click(pom.getPOM3().getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getPOM3().getInstancePP().getTextbox());
		sendkeys(pom.getPOM3().getInstancePP().getNofproduct(), "4");
		click(pom.getPOM3().getInstancePP().getCheckout2());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM3().getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM3().getInstanceCPI().getAgree());
		click(pom.getPOM3().getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM3().getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM3().getInstanceFP().getConfirm());
		javaScriptExecutor();
	}

	@Test(groups = "Dresses",priority = 1)
	public void purchase_EveningDress() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM4().getInstanceHP().getWomen());
		click(pom.getPOM4().getInstanceHP().getDress());
		click(pom.getPOM4().getInstanceHP().getEveningDress());
		// AddToCart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getPOM4().getInstanceATC().getInstock());
		click(pom.getPOM4().getInstanceATC().getAddtocart());
		click(pom.getPOM4().getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getPOM4().getInstancePP().getTextbox());
		sendkeys(pom.getPOM4().getInstancePP().getNofproduct(), "4");
		click(pom.getPOM4().getInstancePP().getCheckout2());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM4().getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM4().getInstanceCPI().getAgree());
		click(pom.getPOM4().getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM4().getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM4().getInstanceFP().getConfirm());
		javaScriptExecutor();
	}

	@Test(groups = "Dresses",priority = 2)
	public void purchase_SummerDress() {
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getPOM5().getInstanceHP().getWomen());
		click(pom.getPOM5().getInstanceHP().getDress());
		click(pom.getPOM5().getInstanceHP().getSummerDress());
		// AddToCart
		implicitWait(10, TimeUnit.SECONDS);
		moveToElement(driver, pom.getPOM5().getInstanceATC().getInstock());
		click(pom.getPOM5().getInstanceATC().getAddtocart());
		click(pom.getPOM5().getInstanceATC().getCheckout1());
		// purchasePage
		implicitWait(10, TimeUnit.SECONDS);
		clear(pom.getPOM5().getInstancePP().getTextbox());
		sendkeys(pom.getPOM5().getInstancePP().getNofproduct(), "4");
		click(pom.getPOM5().getInstancePP().getCheckout2());
		// information checking
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM5().getInstanceIC().getCheckout3());
		// checking purchase Information
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM5().getInstanceCPI().getAgree());
		click(pom.getPOM5().getInstanceCPI().getCheckout4());
		// Bank payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM5().getInstanceBP().getBank());
		// final page
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM5().getInstanceFP().getConfirm());
		javaScriptExecutor();
	}

	@AfterMethod
	public void signOut() {
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getPOM1().getInstanceSO().getSignOut());
	}

	@AfterClass
	public void url_Closed() {
		System.out.println("url closed");
	}

}
