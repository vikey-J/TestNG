package com.runner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.helperrrr.File_Read_Man;
import com.manager.POManager;

public class ConfigurationRunner extends Base_Class{
	public static WebDriver  driver = getBrowser("chrome");
	public static POManager pom=new POManager(driver);
	public static Logger log =Logger.getLogger(Runner.class);
	public static void main(String[] args) throws Throwable  {
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser launched");
		String url = File_Read_Man.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
		log.info("Url launched");
		//login
		String username = File_Read_Man.getInstanceFRM().getInstanceCR().getUsername();
		sendkeys(pom.getHp().getUsername(),username);
		
		String password = File_Read_Man.getInstanceFRM().getInstanceCR().getPassword();
		sendkeys(pom.getHp().getPassword(), password);
		click(pom.getHp().getLogin());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Login successfull");
		// Search Hotel
		implicitWait(30, TimeUnit.SECONDS);
		String location = File_Read_Man.getInstanceFRM().getInstanceCR().getLocation();
		selectByValue(pom.getS().getLocation(), location);
		
		String hotel = File_Read_Man.getInstanceFRM().getInstanceCR().getHotel();
		selectByValue(pom.getS().getHotel(), hotel);
		
		 String roomType = File_Read_Man.getInstanceFRM().getInstanceCR().getRoomtype(); 
		selectByValue(pom.getS().getRoomtypes(), roomType);
        
		String rooms = File_Read_Man.getInstanceFRM().getInstanceCR().getRooms();
		selectByValue(pom.getS().getRooms(), rooms);
		
		String date1 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate1();
		sendkeys(pom.getS().getDate1(), date1);
		
		String date2 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate2();
		sendkeys(pom.getS().getDate2(), date2);
		
		String adult = File_Read_Man.getInstanceFRM().getInstanceCR().getAdult();
		selectByValue(pom.getS().getAdult(),adult);
		
		String child = File_Read_Man.getInstanceFRM().getInstanceCR().getChild();
		selectByValue(pom.getS().getChild(), child);
		click(pom.getS().getSearch());
		implicitWait(20,TimeUnit.SECONDS);
		log.info("Hotel serached successfully");
		// Select hotel
		click(pom.getSh().getAgree());
		click(pom.getSh().getContinue());
		implicitWait(20,TimeUnit.SECONDS);
		log.info("Hotel selected successfully");
		// Book a Hotel
		String fname = File_Read_Man.getInstanceFRM().getInstanceCR().getFname();
		sendkeys(pom.getBh().getFname(), fname);
		
		String lname = File_Read_Man.getInstanceFRM().getInstanceCR().getLname();
		sendkeys(pom.getBh().getLname(),lname);
		
		String address = File_Read_Man.getInstanceFRM().getInstanceCR().getAddress();
		sendkeys(pom.getBh().getAdress(),address);
		
		String creditCard = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCard();
		sendkeys(pom.getBh().getCreditCard(),creditCard);
		
		String creditCardType = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCardType();
		selectByValue(pom.getBh().getCcType(),creditCardType);
		
		String expmonth = File_Read_Man.getInstanceFRM().getInstanceCR().getExpmonth();
		selectByValue(pom.getBh().getExpMonth(), expmonth);
		
		String expYear = File_Read_Man.getInstanceFRM().getInstanceCR().getExpYear();
		selectByValue(pom.getBh().getExpYear(), expYear);
		
		String ccv = File_Read_Man.getInstanceFRM().getInstanceCR().getCCV();
		sendkeys(pom.getBh().getCcv(),ccv);
		click(pom.getBh().getBooknow());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Hotel Booked successfully");
		// Booking Confirmation
		click(pom.getF().getLogout());
		log.info("Logout successfully");
		driver.close();
		log.info("Browser close successfully");
		
	}

}
