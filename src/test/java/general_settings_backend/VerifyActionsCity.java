package general_settings_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyActionsCity extends DriverSetup {
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
		
		//Navigate to City
		WebElement city = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[7]/a/span"));
		city.click();
		Thread.sleep(1000);
		
		//actions
		
		//Delete
		WebElement deleteCity = driver.findElement(By.xpath("//*[@id=\"city_delete\"]"));
		deleteCity.click();
		Thread.sleep(1000);
		
		WebElement delettionCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		delettionCancel.click();
		Thread.sleep(1000);
		
		WebElement cancelOk = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOk.click();
		Thread.sleep(1000);
		
		
		//Edit
		WebElement editCity = driver.findElement(By.xpath("//*[@id=\"city_datatables\"]/tbody/tr[1]/td[7]/a[1]"));
		editCity.click();
		Thread.sleep(1000);
		
		driver.navigate().back(); 
		
		
		//View
		WebElement viewCity = driver.findElement(By.xpath("//*[@id=\"city_datatables\"]/tbody/tr[3]/td[7]/a[2]"));
		viewCity.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
	 
		Thread.sleep(1000);
		driver.close();
		
	}
}
