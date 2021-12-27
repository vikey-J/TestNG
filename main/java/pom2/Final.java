package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final {
	public WebDriver driver;
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement logout;
    public Final(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2,this);
}
    public WebElement getLogout() {
    	return logout;
    }
}
