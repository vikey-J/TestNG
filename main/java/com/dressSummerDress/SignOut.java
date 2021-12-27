package com.dressSummerDress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	public static WebDriver driver;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signOut;
	public SignOut(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getSignOut() {
		return signOut;
	}
	

}
