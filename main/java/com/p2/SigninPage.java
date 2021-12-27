package com.p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public static WebDriver driver;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement mr;
	@FindBy(id="customer_firstname")
	private WebElement fname;
	@FindBy(id="customer_lastname")
	private WebElement lname;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(id="days")
	private WebElement dobday;
	@FindBy(id="months")
	private WebElement dobmonth;
	@FindBy(id="years")
	private WebElement dobyear;
	@FindBy(id="firstname")
	private WebElement afname;
	@FindBy(id="lastname")
	private WebElement alname;
	@FindBy(id="company")
	private WebElement company;
	@FindBy(id="address1")
	private WebElement adress1;
	@FindBy(id="address2")
	private WebElement adress2;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(xpath="//select[@name='id_state']")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement postcode;
	@FindBy(id="phone_mobile")
	private WebElement phone;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement register;
	public SigninPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getMr() {
		return mr;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDobday() {
		return dobday;
	}
	public WebElement getDobmonth() {
		return dobmonth;
	}
	public WebElement getDobyear() {
		return dobyear;
	}
	public WebElement getAfname() {
		return afname;
	}
	public WebElement getAlname() {
		return alname;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getAdress1() {
		return adress1;
	}
	public WebElement getAdress2() {
		return adress2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getRegister() {
		return register;
	}
	
    
}
