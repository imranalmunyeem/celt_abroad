package user_authentication_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;
import pages.LoginPage;


public class Verifylogin extends DriverSetup {
	
	@Test 
	public void LoginTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
	}
		  // The login page allows the user to type their username into the username field
	    public LoginPage typeEmail(String email) {
	        // This is the only place that "knows" how to enter a username
	        By emailLocator = null;
			driver.findElement(emailLocator).sendKeys(email);

	        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
	        //return this;	
	    
		
		
//		//input email
//		WebElement email = driver.findElement(By.name("email"));
//		email.sendKeys("salman.auvi@gmail.com");
//		Thread.sleep(1000);
//		
//		
//		//input password
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("12345678");
//		Thread.sleep(1000);
//	
//		
//		//Login Button
//		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
//		login.click();
//		Thread.sleep(1000);
//	
//		public void loginToWebsite (String userid, String pass) {
//			driver.findElement(email).sendKeys(userid);
//			driver.findElement(password).sendKeys(pass);
//			driver.findElement(submit).sendKeys(userid);
//		}
//			
		
		driver.close();
		return null;
				
		
		
		
	}
	    }

