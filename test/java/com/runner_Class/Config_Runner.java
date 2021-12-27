package com.runner_Class;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.helper.File_Reder_Manager;
import com.pomanager.Page_Object_Manager;

public class Config_Runner extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Test_Runner.class);

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser Launched");
		String url = File_Reder_Manager.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
		log.info("Url launched");
		click(pom.getInstanceHp().getDresses());
		implicitWait(30, TimeUnit.SECONDS);
		log.info("Dresses clicked");
		click(pom.getInstanceHp().getCasual_Dresses());
		implicitWait(30, TimeUnit.SECONDS);
		log.info("Cassual_Dresses clicked");
		// move the mouse to instock
		moveToElement(driver, pom.getInstanceCp().getInstock());
		click(pom.getInstanceCp().getAddcart());
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceCp().getCheckout1());
		log.info("Add to cart Checkout");
		// 1.summary
		javaScriptExecutor();
		implicitWait(30, TimeUnit.SECONDS);
		// click the + button for 6 times
		click(pom.getInstanceSum().getPlusclick1());
		click(pom.getInstanceSum().getPlusclick2());
		click(pom.getInstanceSum().getPlusclick3());
		click(pom.getInstanceSum().getPlusclick4());
		click(pom.getInstanceSum().getPlusclick5());
		click(pom.getInstanceSum().getPlusclick6());
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceSum().getCheckout2());
		log.info("Product purchased");
		// 2.Signin
		implicitWait(30, TimeUnit.SECONDS);
		String email = File_Reder_Manager.getInstanceFRM().getInstanceCR().getEmail();
		sendkeys(pom.getInstanceSingin().getEmail(), email);

		click(pom.getInstanceSingin().getCreate_Acc());
		implicitWait(30, TimeUnit.SECONDS);
		log.info("Create new account process successfully");
		// create an account page
		click(pom.getInstanceNp().getMr());

		String firstname = File_Reder_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		sendkeys(pom.getInstanceNp().getFirstname(), firstname);

		String lastname = File_Reder_Manager.getInstanceFRM().getInstanceCR().getLastname();
		sendkeys(pom.getInstanceNp().getLastname(), lastname);

		String password = File_Reder_Manager.getInstanceFRM().getInstanceCR().getPassword();
		sendkeys(pom.getInstanceNp().getPassword(), password);

		String addfn = File_Reder_Manager.getInstanceFRM().getInstanceCR().getAddfn();
		sendkeys(pom.getInstanceNp().getAdress_Fn(), addfn);

		String addln = File_Reder_Manager.getInstanceFRM().getInstanceCR().getAddln();
		sendkeys(pom.getInstanceNp().getAdress_Ln(), addln);

		String company = File_Reder_Manager.getInstanceFRM().getInstanceCR().getCompany();
		sendkeys(pom.getInstanceNp().getAdress_Company(), company);

		String address = File_Reder_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendkeys(pom.getInstanceNp().getAddress(), address);

		String city = File_Reder_Manager.getInstanceFRM().getInstanceCR().getCity();
		sendkeys(pom.getInstanceNp().getCity(), city);

		String state = File_Reder_Manager.getInstanceFRM().getInstanceCR().getState();
        selectByValue(pom.getInstanceNp().getState(), state);

		String post = File_Reder_Manager.getInstanceFRM().getInstanceCR().getPost();
		sendkeys(pom.getInstanceNp().getPost(), post);

		String phoneno = File_Reder_Manager.getInstanceFRM().getInstanceCR().getPhoneno();
		sendkeys(pom.getInstanceNp().getPhoneno(), phoneno);
		click(pom.getInstanceNp().getRegister());
		implicitWait(30, TimeUnit.SECONDS);
		log.info("new account create successfully");

		// 3.address
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceAp().getCheckout3());
		log.info("Address checked");
		// 4.Shipping
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceSp().getAgree());
		click(pom.getInstanceSp().getCheckout4());
		log.info("Shipping Checkout");
		// 5.Payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstancePp().getBank());
		click(pom.getInstancePp().getConfirm());
		javaScriptExecutor();
		log.info("Payment pay Successfully");
		driver.close();
		log.info("Browser close successfully");

	}
}
