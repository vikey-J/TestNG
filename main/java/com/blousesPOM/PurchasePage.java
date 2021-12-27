package com.blousesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
	public static WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement textbox;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement nofproduct; 
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
    private WebElement checkout2;
	public PurchasePage (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getTextbox() {
		return textbox;
	}
	public WebElement getNofproduct() {
		return nofproduct;
	}
	public WebElement getCheckout2() {
		return checkout2;
	}
	
}
