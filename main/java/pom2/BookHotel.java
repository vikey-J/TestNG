package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement fname;
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement adress;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement creditCard;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement ccv;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement booknow;
	 public BookHotel(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver2,this);
		}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
   

}
