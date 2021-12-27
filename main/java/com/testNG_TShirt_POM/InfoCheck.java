package com.testNG_TShirt_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoCheck {
	public static WebDriver driver;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
	private WebElement checkout3;
	public InfoCheck (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getCheckout3() {
		return checkout3;
	}

}
