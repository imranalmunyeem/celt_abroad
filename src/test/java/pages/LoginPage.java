package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class LoginPage extends DriverSetup{
	@Test
	public void LoginPage() {

	  
	        // Check that we're on the right page.
	        if (!"Login".equals(driver.getTitle())) {
	            // Alternatively, we could navigate to the login page, perhaps logging out first
	            throw new IllegalStateException("This is not the login page");
	        }
	    }

	    // The login page contains several HTML elements that will be represented as WebElements.
	    // The locators for these elements should only be defined once.
	        By emailLocator = By.id("email");
	        By passwordLocator = By.id("password");
	        By loginButtonLocator = By.id("submit");
}
	