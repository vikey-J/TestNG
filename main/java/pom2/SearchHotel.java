package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtypes;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement date1;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement date2;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtypes() {
		return roomtypes;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

}
