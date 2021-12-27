package com.women_POManager;

import org.openqa.selenium.WebDriver;

import com.blousesPOM.PageObjectManager_B;
import com.dressCasualDress.PageObjectManagerCasualDress;
import com.dressEveningDress.PageObjectManagerEveningDress;
import com.dressSummerDress.PageObjectManagerSummerDress;
import com.testNG_TShirt_POM.PageObjectManagerTshirt;

public class PageObjectManager {
	public static WebDriver driver;
	public static PageObjectManagerTshirt pom1;
	public static PageObjectManager_B pom2;
	public static PageObjectManagerCasualDress pom3;
	public static PageObjectManagerEveningDress pom4;
	public static PageObjectManagerSummerDress pom5;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public PageObjectManagerTshirt getPOM1() {
		if (pom1 == null) {
			pom1 = new PageObjectManagerTshirt(driver);
		}
		return pom1;
	}

	public PageObjectManager_B getPOM2() {
		if (pom2 == null) {
			pom2 = new PageObjectManager_B(driver);
		}
		return pom2;
	}

	public PageObjectManagerCasualDress getPOM3() {
        if(pom3==null) {
        	pom3=new PageObjectManagerCasualDress(driver);
        }
		return pom3;
	}

	public PageObjectManagerEveningDress getPOM4() {
		if(pom4==null) {
			pom4=new PageObjectManagerEveningDress(driver);
		}
		return pom4;
	}

	public PageObjectManagerSummerDress getPOM5() {
		if(pom5==null) {
			pom5=new PageObjectManagerSummerDress(driver);
		}
		return pom5;
	}

}
