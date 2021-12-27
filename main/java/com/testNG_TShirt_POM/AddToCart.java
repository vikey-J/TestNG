package com.testNG_TShirt_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public static WebDriver driver;
	@FindBy(xpath="//span[@class='available-now']")
	private WebElement instock;
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement addtocart;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
    private WebElement checkout1;
	public AddToCart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getInstock() {
		return instock;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getCheckout1() {
		return checkout1;
	}
	
	

}
