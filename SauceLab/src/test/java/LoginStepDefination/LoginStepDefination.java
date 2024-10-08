package LoginStepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	public static WebDriver driver;
	@Given("I open the browser with URL {string}")
	public void i_open_the_browser_with_URL(String url) {
	    driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	    
	}

	@Then("I should see the login page")
	public void i_should_see_the_login_page() {
		
		if(driver.findElement(By.id("login-button")).isDisplayed()) 
		{
			System.out.println("System displayed Login Page");
		}
	    }

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
	   driver.findElement(By.id("user-name")).sendKeys(username); 
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String psd) {
	    driver.findElement(By.id("password")).sendKeys(psd);
	}

	@When("I click login")
	public void i_click_login() {
		driver.findElement(By.id("login-button")).click();  	
	}

	@Then("I should see see products")
	public void i_should_see_see_products() {
	if(driver.findElement(By.id("inventory_filter_container")).isDisplayed()) {
		System.out.println("User Login Sucessfully");
	}
	  }

	@Then("I close the Browser")
	public void i_close_the_Browser() {
	    driver.close();
	}
}
