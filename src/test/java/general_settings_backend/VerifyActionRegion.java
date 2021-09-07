package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyActionRegion extends DriverSetup {
	@Test
	public void ActionTestRegion() throws InterruptedException {
		
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
		
		//actions
		
		//Delete
		WebElement deleteRegions = driver.findElement(By.xpath("//*[@id=\"region_program_delete\"]/i"));
		deleteRegions.click();
		Thread.sleep(1000);
		
		WebElement delettionCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		delettionCancel.click();
		Thread.sleep(1000);
		
		WebElement okRegions = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		okRegions.click();
		Thread.sleep(1000);
		
		
		//Edit
		WebElement editRegions = driver.findElement(By.xpath("//*[@id=\"region_datatable-table\"]/tbody/tr[6]/td[4]/a/i"));
		editRegions.click();
		Thread.sleep(1000);
		
		WebElement titleRegions = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		titleRegions.click();
		Thread.sleep(1000);
		

		WebElement nameRegions = driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		nameRegions.click();
		Thread.sleep(1000);
		nameRegions.clear();
		Thread.sleep(1000);
		nameRegions.sendKeys("United Kingdom");
		Thread.sleep(1000);
		
		//Submit
		WebElement submitRegions = driver.findElement(By.xpath("//*[@id=\"session-type-form\"]/div/div/div[6]/button"));
		submitRegions.click();
		Thread.sleep(1000);
	
		
		driver.navigate().back();  
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
