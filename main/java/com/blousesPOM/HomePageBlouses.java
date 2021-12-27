package com.blousesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBlouses {
	public static WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "(//span[@class='grower CLOSE'])[1]")
	private WebElement tops;
	@FindBy(xpath = "(//a[contains(text,blouses)])[24]")
	private WebElement blouse;

    public HomePageBlouses(WebDriver driver2) {
	    this.driver=driver2;
	    PageFactory.initElements(driver2,this);
		}

	public WebElement getWomen() {
		return women;
	}
	public WebElement getTops() {
		return tops;
	}
	public WebElement getBlouse() {
		return blouse;
	}

}
