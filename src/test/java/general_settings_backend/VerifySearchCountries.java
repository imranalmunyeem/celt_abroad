package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;



public class VerifySearchCountries extends DriverSetup{
	@Test
	public void SearchTestCountries() throws InterruptedException {

		
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
		
		
		//Navigate to Languages
		WebElement languages = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[1]/a/span"));
		languages.click();
		Thread.sleep(1000);
		
		
		//Navigate to Regions
		WebElement regions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[2]/a/span"));
		regions.click();
		Thread.sleep(1000);
		
		
		//Navigate to Countries
		WebElement countries = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[3]/a/span"));
		countries.click();
		Thread.sleep(1000);
		
		//Search
		WebElement searchCountries = driver.findElement(By.xpath("//*[@id=\"country_datatables_filter\"]/label/input"));
		searchCountries.click();
		Thread.sleep(2000);
		searchCountries.sendKeys("Hungary");
		Thread.sleep(2000);
				
	}
}
