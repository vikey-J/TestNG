package com.dressCasualDress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankPayment {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement bank;
	public BankPayment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getBank() {
		return bank;
	}

}
