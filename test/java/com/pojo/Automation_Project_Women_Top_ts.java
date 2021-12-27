package com.pojo;

import java.util.concurrent.TimeUnit;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base_Class.Base_Class;
import com.testNG_TShirt_POM.AddToCart;
import com.testNG_TShirt_POM.BankPayment;
import com.testNG_TShirt_POM.CheckingPurchaseInfo;
//import com.testNG_TShirt_POM.CreateNewAccount;
import com.testNG_TShirt_POM.FinalPage;
import com.testNG_TShirt_POM.HomePageTshirt;
import com.testNG_TShirt_POM.InfoCheck;
import com.testNG_TShirt_POM.PageObjectManagerTshirt;
import com.testNG_TShirt_POM.PurchasePage;
import com.testNG_TShirt_POM.SigninPage;

public class Automation_Project_Women_Top_ts extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManagerTshirt pom=new PageObjectManagerTshirt(driver);
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

		// create a new account
//		implicitWait(10, TimeUnit.SECONDS);
//		sendkeys(pom.getInstanceCNA().getEmail(), "vikey49@gmail.com");
//		click(pom.getInstanceCNA().getCna());
//
//		// signInPage
//		implicitWait(30, TimeUnit.SECONDS);
//		click(pom.getInstanceSP().getMr());
//		sendkeys(pom.getInstanceSP().getFname(), "viknesh");
//		sendkeys(pom.getInstanceSP().getLname(), "kumar");
//		sendkeys(pom.getInstanceSP().getPassword(), "vikey@123");
//		selectByValue(pom.getInstanceSP().getDobday(), "5");
//		selectByValue(pom.getInstanceSP().getDobmonth(), "4");
//		selectByValue(pom.getInstanceSP().getDobyear(), "2001");
//		sendkeys(pom.getInstanceSP().getAfname(), "viknesh");
//		sendkeys(pom.getInstanceSP().getAlname(), "kumar");
//		sendkeys(pom.getInstanceSP().getCompany(), "DLF");
//		sendkeys(pom.getInstanceSP().getAdress1(), "7,DLF road");
//		sendkeys(pom.getInstanceSP().getAdress2(), "1st Floor");
//		sendkeys(pom.getInstanceSP().getCity(), "Chennai");
//		selectByValue(pom.getInstanceSP().getState(), "14");
//		sendkeys(pom.getInstanceSP().getPostcode(), "00000");
//		sendkeys(pom.getInstanceSP().getPhone(), "9876543210");
//		click(pom.getInstanceSP().getRegister());

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