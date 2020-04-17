package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripHomePageObject {
	
	WebDriver driver;
	
	//constructor
	public MakeMyTripHomePageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locator
	@FindBy(xpath="//img[@alt='Make My Trip']")
	public WebElement logoOfMakeMyTrip;
	
	
	//functions
	public boolean checkLogo() {
		return logoOfMakeMyTrip.isDisplayed();
	}
	
	public String getTitleOfPage() {
		return driver.getTitle();
	}
	
	

}
