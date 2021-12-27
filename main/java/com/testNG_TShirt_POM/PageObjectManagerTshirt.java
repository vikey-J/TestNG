package com.testNG_TShirt_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManagerTshirt {
	public static WebDriver driver;
	public static HomePageTshirt hp;
	public static AddToCart atc;
	public static PurchasePage pp;
	public static SigninPage sp;
	public static InfoCheck ic;
	public static CheckingPurchaseInfo cpi;
	public static BankPayment bp;
	public static FinalPage fp;
	public static SignOut so;
	

	public PageObjectManagerTshirt(WebDriver driver2) {
		this.driver = driver2;
	}

	public HomePageTshirt getInstanceHP() {
		if (hp == null) {
			hp = new HomePageTshirt(driver);
		}
		return hp;
	}

	public AddToCart getInstanceATC() {
		if (atc == null) {
			atc = new AddToCart(driver);
		}
		return atc;
	}

	public PurchasePage getInstancePP() {
		if (pp == null) {
			pp = new PurchasePage(driver);
		}
		return pp;
	}
	public SigninPage getInstanceSP() {
		if (sp == null) {
			sp = new SigninPage(driver);
		}
		return sp;
	}

	public InfoCheck getInstanceIC() {
		if (ic == null) {
			ic = new InfoCheck(driver);
		}
		return ic;
	}

	public CheckingPurchaseInfo getInstanceCPI() {
		if (cpi == null) {
			cpi = new CheckingPurchaseInfo(driver);
		}
		return cpi;
	}

	public BankPayment getInstanceBP() {
		if (bp == null) {
			bp = new BankPayment(driver);
		}
		return bp;
	}

	public FinalPage getInstanceFP() {
		if (fp == null) {
			fp = new FinalPage(driver);
		}
		return fp;
	}
	
	public SignOut getInstanceSO() {
		if(so==null) {
			so=new SignOut(driver);
		}
		return so;
	}

}
