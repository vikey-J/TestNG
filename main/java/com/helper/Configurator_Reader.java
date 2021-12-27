package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configurator_Reader {
	public static Properties p;

	public Configurator_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname=p.getProperty("lastname");
		return lastname;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getAddfn() {
		String adressfn = p.getProperty("adressfn");
	    return adressfn;
	}
	public String getAddln() {
		String adressln = p.getProperty("adressln");
		return adressln;
	}
	public String getCompany() {
		String company = p.getProperty("company");
		return company;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCity() {
		String city = p.getProperty("city");
		return city;
	}
	public String getState() {
		String state = p.getProperty("state");
		return state;
	}
	public String getPost() {
		String post = p.getProperty("post");
		return post;
	}
	public String getPhoneno() {
	    String phoneno = p.getProperty("phoneno");
	    return phoneno;
	}

}