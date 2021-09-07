package applications_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class StatusButtonsApplications extends DriverSetup {
	@Test
	public void StatusButtonsTest() throws InterruptedException {
	

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
		
		//Applications
		WebElement applications = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[7]/a/span"));
		applications.click();
		Thread.sleep(2000);
		
		//buttons
		WebElement button46 = driver.findElement(By.xpath("//*[@id=\"applicationdatatable-table\"]/tbody/tr[5]/td[6]/button"));
		button46.click();
		Thread.sleep(2000);
		
		WebElement button47 = driver.findElement(By.xpath("//*[@id=\"applicationdatatable-table\"]/tbody/tr[6]/td[6]/button"));
		button47.click();
		Thread.sleep(2000);
		
		WebElement button48 = driver.findElement(By.xpath("//*[@id=\"applicationdatatable-table\"]/tbody/tr[7]/td[6]/button"));
		button48.click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
