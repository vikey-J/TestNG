package com.testNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_Class.Base_Class;
import com.blousesPOM.PageObjectManager_B;
import com.dressCasualDress.PageObjectManagerCasualDress;
import com.helper.File_Reder_Manager;

public class Dress_CasualDress extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManagerCasualDress pom = new PageObjectManagerCasualDress(driver);
	public static Logger log = Logger.getLogger(Dress_CasualDress.class);

	@BeforeClass
	public void url_Launch() throws Throwable {
		implicitWait(10, TimeUnit.SECONDS);
		log.info("Url Launched");
	}
	@BeforeMethod
	public void signIn() {
		implicitWait(10, TimeUnit.SECONDS);
		
	}

	

}
