package com.dressSummerDress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSummerDress {
	public static WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "(//span[@class='grower CLOSE'])[2]")
	private WebElement dress;
	@FindBy(xpath = "(//a[contains(text,Summer)])[28]")
	private WebElement summerDress;

	public HomePageSummerDress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSummerDress() {
		return summerDress;
	}

}
