package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyPreviousNextUniversityRepresentatives extends DriverSetup {
	@Test
	public void PreviousNextTest() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		
		//Navigate to University Settings
		WebElement university_settings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span[1]"));
		university_settings.click();
		Thread.sleep(1000);
		
		//Navigate to Representative
		WebElement representative = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[1]/a/span"));
		representative.click();
		Thread.sleep(1000);
		
				
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		
		
		
		//Previous Next
		WebElement nextRepresentative = driver.findElement(By.xpath("//*[@id=\"universitydatatable-table_next\"]/a"));
		nextRepresentative.click();
		Thread.sleep(2000);
		
		WebElement previousRepresentative = driver.findElement(By.xpath("//*[@id=\"universitydatatable-table_previous\"]"));
		previousRepresentative.click();
		Thread.sleep(2000);
		
	
		
		driver.close();
		
	}
}
