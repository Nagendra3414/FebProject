package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {

	
	
	
	public WebDriver driver;

	// Locators
	@FindBy(xpath = "(//*[text() = 'Checkout: Your Information'])")
	public WebElement infomation;

	@FindBy(xpath = "(//*[@id = 'first-name'])")
	public WebElement firstName;
	
	@FindBy(xpath = "(//*[@id = 'last-name'])")
	public WebElement lastName;
	
	@FindBy(xpath = "(//*[@id = 'postal-code'])")
	public WebElement zipcode;


	@FindBy(xpath = "(//*[@id = 'continue'])")
	public WebElement continue1;
	
	
	public InformationPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void infomationDisplay() {
		infomation.isDisplayed();
		System.out.println("infomation page opened Successfully");
	}
	
	public void firstnameEnter(String Fname) {
		firstName.sendKeys(Fname);
	}

	public void lastNameEnter(String Lname) {
		lastName.sendKeys(Lname);
	}

	public void zipcodeEnter(String zipcode1) {
		zipcode.sendKeys(zipcode1);
	}
	

	public void ContinueClcik() {
		continue1.click();
	}


	
	
	
	
}
