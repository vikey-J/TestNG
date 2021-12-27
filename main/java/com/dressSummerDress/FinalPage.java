package com.dressSummerDress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
	public static WebDriver driver;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement confirmation;
	public FinalPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getConfirm() {
		return confirmation;
	}

}
