package system_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;



public class VerifyCurrenciesEntries extends DriverSetup {
	
	@Test
	public void CurrenciesEntriesTest() throws InterruptedException {
	
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
	
		
//		//Login Button
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(1000);
		
	
		//system_settings
		WebElement systemSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/a/span[1]"));
		systemSettings.click();
		Thread.sleep(1000);
		
		
		//Navigate to currencies
		WebElement locale = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[1]/a/span"));
		locale.click();
		Thread.sleep(2000);
		WebElement currencies = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[2]/a/span"));
		currencies.click();
		Thread.sleep(2000);
		
		
		//entries
		WebElement entriesCurrencies = driver.findElement(By.xpath("//*[@id=\"currency-table_length\"]/label/select"));
		entriesCurrencies.click();
		Thread.sleep(2000);
		
		
		//Entry List
		
		//10
		driver.findElement(By.xpath("//*[@id=\\\"currency-table_length\\\"]/label/select/option[1]")).click();
		entriesCurrencies.click();
		Thread.sleep(1000);
		
		//25
		driver.findElement(By.xpath("//*[@id=\\\"currency-table_length\\\"]/label/select/option[2]")).click();
		entriesCurrencies.click();
		Thread.sleep(1000);
		
		//50
		driver.findElement(By.xpath("//*[@id=\\\"currency-table_length\\\"]/label/select/option[3]]")).click();
		entriesCurrencies.click();
		Thread.sleep(1000);
		
		//100
		driver.findElement(By.xpath("//*[@id=\\\"currency-table_length\\\"]/label/select/option[4]")).click();
		entriesCurrencies.click();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
