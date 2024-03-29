package general_settings_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyActionsSession extends DriverSetup {
	@Test
	public void ActionsTest() throws InterruptedException {
		
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
		
		//Navigate to General Settings
		WebElement generalSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/a/span[1]"));
		generalSettings.click();
		Thread.sleep(1000);
		
		//Navigate to Session
		WebElement session = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[8]/a/span"));
		session.click();
		Thread.sleep(1000);
		
		//Delete
		//Delete
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"session_program_delete\"]"));
		delete.click();
		Thread.sleep(1000);
		
		//Cancel Delete
		WebElement cancelDelete = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelDelete.click();
		Thread.sleep(1000);
		
		//Cancel ok
		WebElement cancelOK = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOK.click();
		Thread.sleep(1000);
		
		//Edit
		WebElement editSession = driver.findElement(By.xpath("//*[@id=\"sessiondatatable-table\"]/tbody/tr[1]/td[4]/a"));
		editSession.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.close();
	}
}
