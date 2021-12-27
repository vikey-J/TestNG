package com.helperrrr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_Read {
	public static Properties p;
	public Config_Read() throws Throwable{
		File f=new File("C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\p2\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getUrl() throws Throwable {
		
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getLocation() {
		String location = p.getProperty("location");
		return location;
	}
	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	public String getRoomtype() {
		String roomType = p.getProperty("roomtype");
		return roomType;
	}
	public String getRooms() {
		String rooms = p.getProperty("rooms");
		return rooms;
	}
	public String getDate1() {
		String date1=p.getProperty("date1");
		return date1;
	}
	public String getDate2() {
		String date2 = p.getProperty("date2");
		return date2;
	}
	public String getAdult() {
		String adult = p.getProperty("adult");
		return adult;
	}
	public String getChild() {
		String child = p.getProperty("child");
		return child;
	}
	public String getFname() {
		String fname = p.getProperty("fname");
		return fname;
	}
	public String getLname() {
		String lname = p.getProperty("lname");
		return lname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCreditCard() {
		String creditCard = p.getProperty("creditcardno");
		return creditCard;
	}
	public String getCreditCardType() {
		String creditCardType = p.getProperty("creditcardtype");
		return creditCardType;
	}
	public String getExpmonth() {
		String expMonth = p.getProperty("expmonth");
		return expMonth;
	}
	public String getExpYear() {
		String expYear = p.getProperty("expyear");
		return expYear;
	}
	public String getCCV() {
		String ccv = p.getProperty("ccv");
		return ccv;
	}
	
	
	
}