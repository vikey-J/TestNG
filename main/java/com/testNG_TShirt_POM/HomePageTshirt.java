package com.testNG_TShirt_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class HomePageTshirt{
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath="(//span[@class='grower CLOSE'])[1]")
	private WebElement tops;
	@FindBy(xpath="(//a[contains(text,T-shirts)])[23]")
	private WebElement tshirt;
	public HomePageTshirt(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2,this);
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getTops() {
		return tops;
	}
	public WebElement getTshirt() {
		return tshirt;
	}
	
}