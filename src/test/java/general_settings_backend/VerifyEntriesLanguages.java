package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyEntriesLanguages extends DriverSetup {
	@Test
	public void LanguagesTestSeneralSettings() throws InterruptedException {
		
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
		
		
		//entries
		WebElement entriesBlog = driver.findElement(By.xpath("//*[@id=\"language-table_length\"]/label/select"));
		entriesBlog.click();
		Thread.sleep(2000);
						
						
		//Entry List
						
		//10
		driver.findElement(By.xpath("//*[@id=\\\"language-table_length\\\"]/label/select/option[1]")).click();
		Thread.sleep(1000);
		entriesBlog.click();
		Thread.sleep(1000);
						
		//25
		driver.findElement(By.xpath("//*[@id=\\\"language-table_length\\\"]/label/select/option[2]")).click();
		Thread.sleep(1000);
		entriesBlog.click();
		Thread.sleep(1000);
						
		//50
		driver.findElement(By.xpath("//*[@id=\\\"language-table_length\\\"]/label/select/option[3]")).click();
		Thread.sleep(1000);
		entriesBlog.click();
		Thread.sleep(1000);
						
		//100
		driver.findElement(By.xpath("//*[@id=\\\"language-table_length\\\"]/label/select/option[4]")).click();
		Thread.sleep(1000);
		entriesBlog.click();
		Thread.sleep(2000);
						
		driver.close();
		
	}
}
