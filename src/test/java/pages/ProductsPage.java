package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver driver;

	// Locators
	@FindBy(xpath = "//*[text() = 'Products']")
	public WebElement products;

	@FindBy(xpath = "(//*[text() = 'Add to cart'])[1]")
	public WebElement addCart;

	@FindBy(xpath = "(//*[@class = 'shopping_cart_link'])")
	public WebElement ShopCart;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void productsDisplay() {
		products.isDisplayed();
		System.out.println("Log in Successfully");
	}

	public void ClickAddCart() {
		addCart.click();
		System.out.println("Add cart clicked Successfully");

	}

	public void ClickShopCart() {
		ShopCart.click();
		System.out.println("Shop cart clicked Successfully");

	}

}
