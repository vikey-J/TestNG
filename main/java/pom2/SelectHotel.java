package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel{
	public WebDriver driver;
	public SelectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement agree;
	public WebElement getAgree() {
		return agree;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuee;
	public WebElement getContinue() {
		return continuee;
	}
	
}

