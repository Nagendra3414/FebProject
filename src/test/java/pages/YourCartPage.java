package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	public WebDriver driver;

	// Locators
	@FindBy(xpath = "(//*[text() = 'Your Cart'])")
	public WebElement yourCart;

	@FindBy(xpath = "(//*[text() = 'Checkout'])")
	public WebElement checkoutButton;

	public YourCartPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void yourCartDisplay() {
		yourCart.isDisplayed();
		System.out.println("yourCart page opened Successfully");
	}

	public void CheckoutClick() {
		checkoutButton.click();
		System.out.println("checkoutButton clicked Successfully");

	}

}
