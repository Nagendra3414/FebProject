package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class login {

	WebDriver driver;
	LoginPage login;

	@Given("^Open browser with URL$")
	public void open_browser_with_url() {

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		System.out.println("Open the Browser");
	}

	@When("^Enter username$")
	public void enter_username() {

		login = new LoginPage(driver);

		login.usernameEnter("standard_user");

		System.out.println("Enter username ");
	}

	@When("^Enter Password$")
	public void enter_password() {

		login = new LoginPage(driver);
		login.passwordEnter("secret_sauce");

		System.out.println("Enter password ");
	}

	@Then("^Clcik on Log in button$")
	public void clcik_on_log_in_button() throws Throwable {

		login = new LoginPage(driver);
		login.LoginClick();
		System.out.println("Click on Login button ");
	}

	@And("^Close the Browser$")
	public void close_the_browser() throws Throwable {

		driver.close();
		System.out.println("Close the browser ");
	}

	@When("^Enter the username (.+)$")
	public void enter_the_username(String username) throws Throwable {
		login = new LoginPage(driver);

		login.usernameEnter(username);
	}

	@When("^Enter the password (.+)$")
	public void enter_the_password(String password) throws Throwable {

		login = new LoginPage(driver);
		login.passwordEnter(password);
	}
	
	
	 @Given("^print something$")
	    public void print_something() throws Throwable {
	       System.out.println("****************************************************************");
	    }

}
