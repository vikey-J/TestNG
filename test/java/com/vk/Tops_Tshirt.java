package com.vk;

import java.util.concurrent.TimeUnit;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.base_Class.Base_Class;
import com.testNG_TShirt_POM.AddToCart;
import com.testNG_TShirt_POM.BankPayment;
import com.testNG_TShirt_POM.CheckingPurchaseInfo;
import com.testNG_TShirt_POM.FinalPage;
import com.testNG_TShirt_POM.HomePageTshirt;
import com.testNG_TShirt_POM.InfoCheck;
import com.testNG_TShirt_POM.PageObjectManagerTshirt;
import com.testNG_TShirt_POM.PurchasePage;
import com.testNG_TShirt_POM.SigninPage;

public class Tops_Tshirt extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManagerTshirt pom = new PageObjectManagerTshirt(driver);

	public static void main(String[] args) {
		driver.get("http://automationpractice.com/index.php");

		// HomePage
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getInstanceHP().getWomen());
		implicitWait(10, TimeUnit.SECONDS);
		click(pom.getInstanceHP().getTops());
		click(pom.getInstanceHP().getTshirt());

		// AddToCart
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