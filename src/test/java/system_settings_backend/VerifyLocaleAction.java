package system_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyLocaleAction extends DriverSetup {
	
	@Test
	public void LocaleActionTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
		
		
		//input email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("salman.auvi@gmail.com");
		Thread.sleep(1000);
		
		
		//input password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
	
		
		//Login Button
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(1000);
		
		
		//system_settings
		WebElement systemSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/a/span[1]"));
		systemSettings.click();
		Thread.sleep(2000);
				
				
		//Navigate to locale 
		WebElement locale = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[1]/a/span"));
		locale.click();
		Thread.sleep(2000);
		
		//Action
		//Default
		WebElement makeDefault = driver.findElement(By.xpath("//*[@id=\"default_lang\"]/i"));
		makeDefault.click();
		Thread.sleep(3000);
		
		WebElement cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
		cancel.click();
		
		
		//Add
		WebElement add = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		add.click();
		Thread.sleep(3000);
		
		
		//Add Locale
		WebElement addLocale = driver.findElement(By.xpath("//*[@id=\"locale\"]"));
		addLocale.sendKeys("SP");
		Thread.sleep(3000);
		
		 
		//Add Title
		WebElement addTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		addTitle.sendKeys("Spain");
		Thread.sleep(3000);
		
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"locale-form\"]/div[3]/button"));
		submit.click();
		Thread.sleep(3000);
		
		//Delete
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"locale_delete\"]"));
		delete.click();
		Thread.sleep(3000);
	    
		//Cancel the Deletion Process
	    WebElement deletionCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
	    deletionCancel.click();
	    Thread.sleep(2000);
	    
	    driver.close();
	}
}
