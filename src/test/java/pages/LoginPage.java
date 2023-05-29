package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Locators and Operations

	public WebDriver driver;

	// WebElement username = driver.findElement(By.xpath("//*[@id = 'user-name']"));

	// Locators
	@FindBy(xpath = "//*[@id = 'user-name']")
	public WebElement username;

	@FindBy(xpath = "//*[@id = 'password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id = 'login-button']")
	public WebElement loginButton;

//Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Operators
	public void usernameEnter(String Username) {
		username.sendKeys(Username);
	}

	public void passwordEnter(String pwd) {
		password.sendKeys(pwd);
	}

	public void LoginClick() {
		loginButton.click();
	}

}
